package com.example.PigeonsVoyageurs.competition.dto;

import com.example.PigeonsVoyageurs.entities.Ranking;
import com.example.PigeonsVoyageurs.season.Season;
import java.time.LocalDateTime;
import java.util.List;

public record CompetitionResponseDTO(String id, String raceName, Coordinate coordinate, LocalDateTime start, double Distance, Season season, List<Ranking> rankings) {
}
