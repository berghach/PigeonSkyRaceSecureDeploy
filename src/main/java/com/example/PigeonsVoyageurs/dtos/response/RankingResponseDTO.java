package com.example.PigeonsVoyageurs.dtos.response;

public record RankingResponseDTO(
        String id,
        String competitionName,
        String pigeonRing,
        int position,
        double distance,
        java.time.LocalTime duration,
        double speed,
        double score
) {}
