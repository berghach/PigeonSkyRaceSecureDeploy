package com.example.PigeonsVoyageurs.pigeon;

import com.example.PigeonsVoyageurs.entities.Pigeon;
import com.example.PigeonsVoyageurs.dtos.request.PigeonRequestDTO;
import com.example.PigeonsVoyageurs.dtos.response.PigeonResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PigeonMapper {

    @Mapping(target = "rankings", ignore = true)
    Pigeon toEntity(PigeonRequestDTO dto);
    PigeonResponseDTO toResponseDTO(Pigeon pigeon);
}