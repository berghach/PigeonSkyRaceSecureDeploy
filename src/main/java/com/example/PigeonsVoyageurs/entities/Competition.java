package com.example.PigeonsVoyageurs.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Table(name = "competition")
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String raceName;
    private LocalDateTime start;
    private double distance;

    @Column(name = "loft_latitude", nullable = true)
    private double loftLatitude;

    @Column(name = "loft_longitude", nullable = true)
    private double loftLongitude;

}