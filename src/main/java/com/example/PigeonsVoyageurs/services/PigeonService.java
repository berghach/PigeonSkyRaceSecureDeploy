package com.example.PigeonsVoyageurs.services;

import com.example.PigeonsVoyageurs.dtos.request.PigeonRequestDTO;
import com.example.PigeonsVoyageurs.dtos.response.PigeonResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PigeonService {
    
    public Optional<PigeonResponseDTO> get(UUID id) {
        return Optional.empty();
    }

    
    public List<PigeonResponseDTO> getAll() {
        return List.of();
    }

    
    public PigeonResponseDTO save(PigeonRequestDTO reqEntity) {
        return null;
    }

    
    public PigeonResponseDTO update(PigeonRequestDTO reqEntity, UUID oldId) {
        return null;
    }

    
    public boolean delete(UUID oldId) {
        return false;
    }
}
