package org.example;

import org.example.exceptions.InvalidTicketCountException;
import org.example.exceptions.NotEnoughMoneyException;
import org.example.exceptions.NotEnoughTicketsException;
import org.example.exceptions.NotFoundMovieException;
import org.example.repo.MovieListRepo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        showOptions();
    }

    private static void showOptions() {
        double userAmount;
        int ticketCount;
        String movieName = "";
        TicketPurchaseService service = new TicketPurchaseService(new MovieListRepo());
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Welcome to TickiMo");

            System.out.print("Enter your Amount: ");
            userAmount = in.nextDouble();
            in.nextLine(); // مصرف Enter باقی‌مانده

            System.out.print("Enter the name of the movie: ");
            movieName = in.nextLine();

            System.out.print("Enter the number of tickets: ");
            ticketCount = in.nextInt();

            double remainingAmount = service.purchase(movieName, ticketCount, userAmount);
            System.out.println("successful phrase your amount is " + remainingAmount);

        } catch (NotFoundMovieException e) {
            System.out.println(" Movie : " + movieName + "not found");
        } catch (NotEnoughTicketsException e) {
            System.out.println("not Enough tickets");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Not Enough Monet");
        } catch (InvalidTicketCountException e) {
            System.out.println("Your Money is not Enough");
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
        in.close();
    }
}