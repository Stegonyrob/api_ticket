package dev.stella.api_movie.services;

import java.util.List;
import org.springframework.stereotype.Service;

import dev.stella.api_movie.exceptions.MovieNotFoundException;
import dev.stella.api_movie.models.Movie;
import dev.stella.api_movie.repositories.MovieRepository;

@Service
public class MovieService {
    MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public List<Movie> getAll() {// metodo que muestra todas las peliculas
        List<Movie> movies = repository.findAll();
        return movies;
    }

    public Movie getById(Long id) throws Exception {
        Movie movie = repository.findById(id).orElseThrow(() -> new MovieNotFoundException("Movie not found"));

        return movie;
    }

    public Movie save(Movie movie) {

        Movie newMovie = repository.save(movie);
        return newMovie;
    }

    public Movie update(Long id, Movie movie) throws Exception {

        Movie updatingMovie = repository.findById(id).orElseThrow(() -> new MovieNotFoundException("Movie not found"));

        updatingMovie.setTitle(movie.getTitle());
        updatingMovie.setDescription(movie.getDescription());
        updatingMovie.setRunning_time(movie.getRunning_time());
        updatingMovie.setCreation_year(movie.getCreation_year());
        Movie updatedMovie = repository.save(updatingMovie);

        return updatedMovie;
    }

    public String delete(Long id) throws Exception {

        Movie movie = repository.findById(id).orElseThrow(() -> new MovieNotFoundException("Movie not found"));

        repository.delete(movie);

        String message = "The movie is deleted";

        return message;
    }

}
