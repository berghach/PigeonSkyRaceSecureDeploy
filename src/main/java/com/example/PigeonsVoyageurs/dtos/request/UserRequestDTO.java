package com.example.PigeonsVoyageurs.dtos.request;

import com.example.PigeonsVoyageurs.enumeration.Role;
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

        Role role,
        String loftName,
        double loftLatitude,
        double loftLongitude
) {
}
