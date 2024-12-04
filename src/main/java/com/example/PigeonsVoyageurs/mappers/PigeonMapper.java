package com.example.PigeonsVoyageurs.mappers;

import com.example.PigeonsVoyageurs.dtos.request.PigeonRequestDTO;
import com.example.PigeonsVoyageurs.dtos.response.PigeonResponseDTO;
import com.example.PigeonsVoyageurs.entities.Pigeon;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface PigeonMapper {

    Pigeon toEntity(PigeonRequestDTO pigeonRequestDTO);
    PigeonResponseDTO toResponseDTO(Pigeon pigeon);
}
