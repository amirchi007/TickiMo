package org.example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        showOptions();

    }

    private static void showOptions() {
        double userAmount;

        Scanner in = new Scanner(System.in);

        System.out.println("welcome to TickiMo");
        System.out.println("Enter your Amount");
        userAmount = in.nextInt();

        System.out.println("select the movie that you want to see");
        System.out.println("number one");
    }
}