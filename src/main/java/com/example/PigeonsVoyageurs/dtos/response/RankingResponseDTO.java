package com.example.PigeonsVoyageurs.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RankingResponseDTO {
    Long id;
    String competitionName;
    String pigeonRing;
    int position;
    double distance;
    java.time.LocalTime duration;
    double speed;
    double score;
}