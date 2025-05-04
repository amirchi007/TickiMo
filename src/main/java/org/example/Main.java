package org.example;

import org.example.exceptions.NotFoundMovieException;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        showOptions();

    }

    private static void showOptions() {
        double userAmount;
        int ticket;
        Boolean isRunning;
        String movieName;

        Scanner in = new Scanner(System.in);

        System.out.println("welcome to TickiMo");
        System.out.println("Enter your Amount");
        userAmount = in.nextInt();

        System.out.println("select the movie that you want to see");
        System.out.println("Enter the name of the movie");
        movieName = in.next();

        if (movieName.equals("Inception") || movieName.equals("Harry Potter") || movieName.equals("Avatar")) {
            System.out.println("Enter how many ticket you want to see");
            ticket = in.nextInt();
        } else throw new NotFoundMovieException();
    }
}