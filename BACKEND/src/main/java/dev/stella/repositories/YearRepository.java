package dev.stella.api_movie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.stella.api_movie.models.Year;

public interface YearRepository extends JpaRepository<Year,Long> {

}