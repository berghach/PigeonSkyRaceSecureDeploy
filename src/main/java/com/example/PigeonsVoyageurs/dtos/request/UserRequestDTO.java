package com.example.PigeonsVoyageurs.dtos.request;

import lombok.Builder;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Builder(builderClassName = "Builder")
public record UserRequestDTO(
        @NotNull(message = "Username is required")
        String userName,

        @Email
        @NotNull(message = "Email is required")
        String email,

        @NotNull(message = "Password is required")
        String password,

        String loftName,
        double loftLatitude,
        double loftLongitude
) {
}
