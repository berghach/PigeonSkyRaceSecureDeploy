package com.example.PigeonsVoyageurs.entities;

import com.example.PigeonsVoyageurs.enumeration.Sexe;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.Set;

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
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "sexe")
    @Enumerated(EnumType.STRING)
    private Sexe sexe;

    @Column(name = "color")
    private String color;

    @Column(name = "age")
    private int age;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, foreignKey = @ForeignKey(name = "fk_pigeon_user"))
    private User user;

    @OneToMany(mappedBy = "pigeon", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Ranking> rankings;
}