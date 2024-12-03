package com.example.PigeonsVoyageurs.entities;

import com.example.PigeonsVoyageurs.enumeration.Role;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.validation.constraints.Email;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "user_name", nullable = false, unique = true)
    private String username;

    @Email
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "user_role", nullable = false)
    private String role;

    @Column(name = "loft_name", nullable = true)
    private String loftName;

    @Column(name = "loft_latitude", nullable = true)
    private double loftLatitude;

    @Column(name = "loft_longitude", nullable = true)
    private double loftLongitude;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Pigeon> pigeons;

    @PrePersist
    private void setDefaultRole() {
        if (role == null || role.isEmpty()) {
            this.role = String.valueOf(Role.ROLE_USER);
        }
    }
}
