package com.example.PigeonsVoyageurs.ranking.service;

import com.example.PigeonsVoyageurs.dtos.request.RankingRequestDTO;
import com.example.PigeonsVoyageurs.dtos.response.RankingResponseDTO;

import java.util.List;

public interface RankingService {

    RankingResponseDTO save(RankingRequestDTO rankingDTO);

    RankingResponseDTO findById(String id);

    List<RankingResponseDTO> findAll();

    void delete(String id);
}
