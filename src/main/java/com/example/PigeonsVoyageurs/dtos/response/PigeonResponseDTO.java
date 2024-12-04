package com.example.PigeonsVoyageurs.dtos.response;

import com.example.PigeonsVoyageurs.entities.User;
import com.example.PigeonsVoyageurs.enumeration.Sexe;
import com.example.PigeonsVoyageurs.entities.Ranking;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PigeonResponseDTO {
    private UUID id;

    private Sexe sexe;

    private String color;

    private int age;

    private String owner;
}
