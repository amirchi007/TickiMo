package org.example.model;

public class    Movie {
    private String title;
    private double price;
    private int availableTickets;


    public Movie(String title, double price, int availableTickets) {
        this.title = title;
        this.price = price;
        this.availableTickets = availableTickets;
    }

    public String getTitle() {
        return title;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public double getPrice() {
        return price;
    }

    public boolean CheckMovieName(String title) {
        return this.title.equals(title);
    }

    public Boolean CheckMoviePrice(double price) {
        return this.price == price;
    }


    public Boolean CheckMovieAvailableTickets(int availableTickets) {
        return this.availableTickets >= availableTickets;
    }

    public void reduceTickets(int counter) {
        if (this.availableTickets < counter) {
            throw new IllegalArgumentException();
        }this.availableTickets -= counter;
    }

    public void Purchase(double price) {
        if (this.CheckMovieName(title) && this.CheckMoviePrice(price) && this.CheckMovieAvailableTickets(availableTickets)) {
            this.availableTickets--;
        }
    }
}
