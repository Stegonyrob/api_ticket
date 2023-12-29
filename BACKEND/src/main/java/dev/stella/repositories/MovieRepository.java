package dev.stella.api_movie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.stella.api_movie.models.Movie;

public interface MovieRepository extends JpaRepository <Movie,Long> {
    
}
