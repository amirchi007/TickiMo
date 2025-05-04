package org.example;

import org.example.exceptions.NotEnoughMoneyException;

import org.example.exceptions.InvalidTicketCountException;
import org.example.exceptions.NotEnoughTicketsException;
import org.example.exceptions.NotFoundMovieException;
import org.example.model.Movie;
import org.example.repo.MovieListRepo;
import org.example.repo.MovieRepo;


public class TicketPurchaseService {
    MovieRepo movieRepo = new MovieListRepo();

    public TicketPurchaseService(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    public double purchase(String title, int ticketCount, double userAmount)
            throws NotFoundMovieException, NotEnoughMoneyException,
            NotEnoughTicketsException, InvalidTicketCountException {

        Movie movie = movieRepo.findMovieByTitle(title);

        if (ticketCount <= 0 ) {
            throw new InvalidTicketCountException("No ticket Avalable");
        }
        if (movie.getAvailableTickets() < ticketCount){
            throw new NotEnoughTicketsException("Not enough tickets");
        }

        double lastPrice = ticketCount * movie.getPrice();

        if (userAmount < lastPrice) {
            throw new NotEnoughMoneyException("Not Enough Money Available You Need " + lastPrice + "but you have " + userAmount);
        }

        movie.reduceTickets(ticketCount);
        return userAmount - lastPrice;
    }
}
