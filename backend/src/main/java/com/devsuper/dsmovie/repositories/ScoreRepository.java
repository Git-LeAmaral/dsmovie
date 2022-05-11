package com.devsuper.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuper.dsmovie.entities.Score;
import com.devsuper.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
