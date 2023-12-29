package dev.stella.api_movie.exceptions;

public class MovieException extends RuntimeException {

    public MovieException(String message) {
        super(message);
    }

    public MovieException(String message, Throwable cause) {
        super(message, cause);
    }

}