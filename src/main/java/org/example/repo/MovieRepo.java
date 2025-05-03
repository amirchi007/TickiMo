package org.example.repo;

import org.example.model.Movie;

import java.util.List;
import java.util.TreeSet;

public interface MovieRepo {
    //    Movie m = new Movie();
    TreeSet<Movie> getAllMovies();

    Movie getMovie(String title);
}
