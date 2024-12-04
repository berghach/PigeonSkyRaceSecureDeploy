package com.example.PigeonsVoyageurs.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;


@Entity
@Table(name = "competition")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "race_name")
    private String raceName;

    @Column(name = "start_at")
    private LocalDateTime startAt;

    @Column(name = "distance")
    private double distance;

    @Column(name = "loft_latitude", nullable = true)
    private double loftLatitude;

    @Column(name = "loft_longitude", nullable = true)
    private double loftLongitude;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, foreignKey = @ForeignKey(name = "fk_competition_user"))
    private User user;

    @OneToMany(mappedBy = "pigeon", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Ranking> rankings;
}