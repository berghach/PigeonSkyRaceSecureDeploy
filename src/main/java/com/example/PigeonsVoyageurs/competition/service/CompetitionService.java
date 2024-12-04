package com.example.PigeonsVoyageurs.competition.service;

import com.example.PigeonsVoyageurs.dtos.response.CompetitionResponseDTO;
import com.example.PigeonsVoyageurs.dtos.request.CompetitionRequestDTO;

import java.util.List;

public interface CompetitionService {

    CompetitionResponseDTO save(CompetitionRequestDTO seasonDTO);

    CompetitionResponseDTO findById(String id);

    List<CompetitionResponseDTO> findAll();

    void delete(String id);
}
