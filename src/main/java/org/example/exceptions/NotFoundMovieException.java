package org.example.exceptions;

public class NotFoundMovieException extends NullPointerException {
    public NotFoundMovieException() {}
    public NotFoundMovieException(String message) {}
    public NotFoundMovieException(String message, Throwable cause) {}
}
