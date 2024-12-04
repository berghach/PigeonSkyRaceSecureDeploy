package com.example.PigeonsVoyageurs.entities;

import com.example.PigeonsVoyageurs.enumeration.Sexe;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

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
    @Column(name ="id")
    private UUID id;

    @Column(name = "pigeon_ring")
    private String pigeonRing;

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

//    @PrePersist
//    private void setGeneratedPigeonRing(){
//        StringBuilder str = new StringBuilder();
//        if (this.sexe.equals(Sexe.MALE)){
//            str.append("M");
//        }else {
//            str.append("F");
//        }
//        str.append(this.user.getLoftName().substring(0, 1).toUpperCase())
//                .append("-")
//                .append(this.age);
//
//        this.pigeonRing = String.valueOf(str);
//    }
}