package com.example.PigeonsVoyageurs.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;


@Entity
@Table(name = "competition")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name ="id")
    private UUID id;

    @Column(name = "race_name")
    private String raceName;

    @Column(name = "start_at")
    private LocalDateTime startAt;

    @Column(name = "distance")
    private double distance;

    @Column(name = "start_latitude", nullable = true)
    private double startLatitude;

    @Column(name = "start_longitude", nullable = true)
    private double startLongitude;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, foreignKey = @ForeignKey(name = "fk_competition_user"))
    private User user;

    @OneToMany(mappedBy = "competition", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Ranking> rankings;
}