package com.example.PigeonsVoyageurs.entities;

import com.example.PigeonsVoyageurs.enumeration.Sex;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
@Table(name = "pigeon")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Pigeon {
    @Id
    private String pigeonRing;
    private Sex sex;
    private String color;
    private int age;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, foreignKey = @ForeignKey(name = "fk_pigeon_user"))
    private User user;
    private List<Ranking> rankings;
}