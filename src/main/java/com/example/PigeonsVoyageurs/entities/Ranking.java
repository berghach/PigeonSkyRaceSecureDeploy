package com.example.PigeonsVoyageurs.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "ranking",
        uniqueConstraints = @UniqueConstraint(
                name = "combination_must_be_unique",
                columnNames = {"competition_id", "pigeon_id"}
        )
)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Ranking {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name ="id")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "competition_id")
    private Competition competition;

    @ManyToOne
    @JoinColumn(name = "pigeon_id")
    private Pigeon pigeon;

    @Column(name = "position")
    private int position;

    @Column(name = "distance")
    private double distance;

    @Column(name = "duration")
    private LocalTime duration;

    @Column(name = "speed")
    private double speed;

    @Column(name = "score")
    private double score;
}
