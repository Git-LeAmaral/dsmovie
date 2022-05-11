package com.devsuper.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuper.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
