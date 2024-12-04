package com.example.PigeonsVoyageurs.pigeon.service;

import com.example.PigeonsVoyageurs.dtos.request.PigeonRequestDTO;
import com.example.PigeonsVoyageurs.dtos.response.PigeonResponseDTO;

import java.util.List;

public interface PigeonService {

    PigeonResponseDTO save(PigeonRequestDTO pigeonRequestDTO);

    PigeonResponseDTO findById(String pigeonRing);

    List<PigeonResponseDTO> findAll();

    void delete(String pigeonRing);
}

