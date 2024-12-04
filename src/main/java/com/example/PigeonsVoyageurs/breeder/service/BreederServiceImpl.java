package com.example.PigeonsVoyageurs.breeder.service;

import com.example.PigeonsVoyageurs.breeder.BreederMapper;
import com.example.PigeonsVoyageurs.dtos.response.UserResponseDTO;
import com.example.PigeonsVoyageurs.repositories.UserRepository;
import com.example.PigeonsVoyageurs.dtos.request.UserRequestDTO;
import com.example.PigeonsVoyageurs.breeder.Breeder;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BreederServiceImpl implements BreederService {

    private final UserRepository userRepository;
    private final BreederMapper breederMapper;
    
    @Autowired
    public BreederServiceImpl(UserRepository userRepository, BreederMapper breederMapper) {
        this.userRepository = userRepository;
        this.breederMapper = breederMapper;
    }

    @Override
    public UserResponseDTO register(UserRequestDTO breederDTO) {
        String hashedPassword = BCrypt.hashpw(breederDTO.password(), BCrypt.gensalt());
        Breeder breeder = breederMapper.toEntity(breederDTO);
        breeder.setPassword(hashedPassword);
        Breeder savedBreeder = userRepository.save(breeder);
        return breederMapper.toResponseDTO(savedBreeder);
    }

    @Override
    public Optional<String> login(String email, String password) {
        Optional<Breeder> breederOpt = userRepository.findByEmail(email);
        if (breederOpt.isPresent()) {
            Breeder breeder = breederOpt.get();
            if (BCrypt.checkpw(password, breeder.getPassword())) {
                return Optional.of("Login successful");
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<UserResponseDTO> findById(String id) {
        return userRepository.findById(id)
                .map(breederMapper::toResponseDTO);
    }

    @Override
    public Optional<UserResponseDTO> findByEmail(String email) {
        return userRepository.findByEmail(email)
                .map(breederMapper::toResponseDTO);
    }

    @Override
    public List<UserResponseDTO> findAll() {
        return userRepository.findAll().stream()
                .map(breederMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UserResponseDTO update(String id, UserRequestDTO breederDTO) {
        Breeder breeder = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Breeder not found"));

        breeder.setUserName(breederDTO.userName());

        if (breederDTO.password() != null && !breederDTO.password().isEmpty()) {
            String hashedPassword = BCrypt.hashpw(breederDTO.password(), BCrypt.gensalt());
            breeder.setPassword(hashedPassword);
        }

        breeder.setEmail(breederDTO.email());
        Breeder updatedBreeder = userRepository.save(breeder);

        return breederMapper.toResponseDTO(updatedBreeder);
    }

    @Override
    public void delete(String id) {
        userRepository.deleteById(id);
    }
}
