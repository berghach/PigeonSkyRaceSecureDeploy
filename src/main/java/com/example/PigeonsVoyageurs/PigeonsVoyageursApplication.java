package com.example.PigeonsVoyageurs;

import com.example.PigeonsVoyageurs.competition.Competition;
import com.example.PigeonsVoyageurs.competition.CompetitionRepository;
import com.example.PigeonsVoyageurs.coordinate.Coordinate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class PigeonsVoyageursApplication {

	public static void main(String[] args) {

		SpringApplication.run(PigeonsVoyageursApplication.class, args);
	}
}