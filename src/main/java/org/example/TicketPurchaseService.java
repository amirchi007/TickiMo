package org.example;

import org.example.exceptions.AmountException;

import org.example.exceptions.NotFoundMovieException;
import org.example.model.Movie;
import org.example.repo.MovieListRepo;
import org.example.repo.MovieRepo;



public class TicketPurchaseService {
    MovieRepo movieRepo = new MovieListRepo();

    public TicketPurchaseService(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    public double Purchase(String title , int ticketCount, double userAmount) throws AmountException {
        Movie movie = movieRepo.findMovieByTitle(title);

        if (movie == null){
            throw new NotFoundMovieException("Movie Not Founded");
        }

        if (ticketCount <= 0 || movie.getAvailableTickets() < ticketCount){
            throw new AmountException("No ticket Avalable");
        }

        double lastPrice = ticketCount * movie.getPrice();

        if (userAmount > lastPrice){
            throw new AmountException("Not Enough Money");
        }

        movie.reduceTickets(ticketCount);

        return userAmount - lastPrice;
    }

}
