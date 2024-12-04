package com.example.PigeonsVoyageurs.breeder.service;

import com.example.PigeonsVoyageurs.dtos.request.UserRequestDTO;
import com.example.PigeonsVoyageurs.dtos.response.UserResponseDTO;

import java.util.List;
import java.util.Optional;

public interface BreederService {
    UserResponseDTO register(UserRequestDTO breederDTO);

    Optional<String> login(String userName, String password);

    Optional<UserResponseDTO> findById(String id);

    Optional<UserResponseDTO> findByEmail(String email);

    List<UserResponseDTO> findAll();

    UserResponseDTO update(String id, UserRequestDTO breederDTO);

    void delete(String id);
}
