package org.example.repo;

import org.example.exceptions.NotFoundMovieException;
import org.example.model.Movie;

public interface MovieRepo {
    Movie findMovieByTitle(String title) throws NotFoundMovieException;
}
