package com.example.PigeonsVoyageurs.services;

import com.example.PigeonsVoyageurs.dtos.request.UserRequestDTO;
import com.example.PigeonsVoyageurs.dtos.response.UserResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    
    public Optional<UserResponseDTO> get(UUID id) {
        return Optional.empty();
    }

    
    public List<UserResponseDTO> getAll() {
        return List.of();
    }

    
    public UserResponseDTO save(UserRequestDTO reqEntity) {
        return null;
    }

    
    public UserResponseDTO update(UserRequestDTO reqEntity, UUID oldId) {
        return null;
    }

    
    public boolean delete(UUID oldId) {
        return false;
    }
}
