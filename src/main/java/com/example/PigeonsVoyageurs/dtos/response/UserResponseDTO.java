package com.example.PigeonsVoyageurs.dtos.response;

import com.example.PigeonsVoyageurs.entities.Competition;
import com.example.PigeonsVoyageurs.entities.Pigeon;
import com.example.PigeonsVoyageurs.enumeration.Role;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {
    private UUID id;

    private String username;

    private String email;

    private Role role;

    private String loftName;

    private double loftLatitude;

    private double loftLongitude;

}
