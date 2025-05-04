package org.example.model;

public class Movie {
    private final String title;
    private final double price;
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

    public void reduceTickets(int counter) {
        if (this.availableTickets < counter) {
            throw new IllegalArgumentException();
        }
        this.availableTickets -= counter;
    }

}
