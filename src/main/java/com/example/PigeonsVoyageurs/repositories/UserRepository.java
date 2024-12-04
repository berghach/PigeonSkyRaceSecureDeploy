package com.example.PigeonsVoyageurs.repositories;

import com.example.PigeonsVoyageurs.breeder.Breeder;
import com.example.PigeonsVoyageurs.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<Breeder> findByEmail(String email);
}

