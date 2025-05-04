package org.example.model;

public class Movie {
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

    public void reduceTickets(int counter) {
        if (this.availableTickets < counter) {
            throw new IllegalArgumentException();
        }
        this.availableTickets -= counter;
    }

}
