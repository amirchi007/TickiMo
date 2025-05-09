package org.example.repo;

import org.example.exceptions.NotFoundMovieException;
import org.example.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieListRepo implements MovieRepo {
    private final List<Movie> movies;

    public MovieListRepo() {
        movies = new ArrayList<>();
        
        movies.add(new Movie("Inception", 50, 100));
        movies.add(new Movie("Interstellar", 70, 80));
        movies.add(new Movie("Avatar", 60, 50));
    }

    @Override
    public Movie findMovieByTitle(String title) throws NotFoundMovieException {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        throw new NotFoundMovieException("Movie not found: " + title);
    }
}
