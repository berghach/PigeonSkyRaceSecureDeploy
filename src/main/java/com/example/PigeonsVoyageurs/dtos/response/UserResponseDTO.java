package com.example.PigeonsVoyageurs.dtos.response;

import java.util.UUID;

public record UserResponseDTO(UUID id, String userName, String email) {
}
