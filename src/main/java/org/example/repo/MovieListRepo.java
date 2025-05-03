package org.example.repo;

import org.example.model.Movie;

import java.util.TreeSet;

public class MovieListRepo implements MovieRepo {
    private final TreeSet<Movie> movies;

    public MovieListRepo() {
        movies = new TreeSet<Movie>();
        movies.add(new Movie("Inception", 50, 100));
        movies.add(new Movie("Interstellar", 70, 80));
        movies.add(new Movie("Avatar", 60, 50));
    }

    @Override
    public TreeSet<Movie> getAllMovies() {
        return movies;
    }

    @Override
    public Movie getMovie(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        return null;
    }
}
