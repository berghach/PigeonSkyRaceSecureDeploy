package com.example.PigeonsVoyageurs.mappers;

import com.example.PigeonsVoyageurs.dtos.request.CompetitionRequestDTO;
import com.example.PigeonsVoyageurs.dtos.response.CompetitionResponseDTO;
import com.example.PigeonsVoyageurs.entities.Competition;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface CompetitionMapper {

    Competition toEntity(CompetitionRequestDTO competitionRequestDTO);
    CompetitionResponseDTO toResponseDTO(Competition competition);
}
