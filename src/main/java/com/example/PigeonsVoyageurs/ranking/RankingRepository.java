package com.example.PigeonsVoyageurs.ranking;

import com.example.PigeonsVoyageurs.entities.Ranking;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RankingRepository extends MongoRepository<Ranking, String> {
}
