import org.example.TicketPurchaseService;
import org.example.exceptions.AmountException;
import org.example.model.Movie;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketPurchaseTest {

    Movie movie;
    TicketPurchaseService ticketPurchaseService;

    @BeforeEach
    public void setUp() {
        movie = new Movie("Avatar", 20, 3);
        ticketPurchaseService = new TicketPurchaseService();
    }

    @Test
    void SuccessfulPurchase() {
//        movie.Purchase(1,5);

    }

    @Test
    void MovieIsNotExist() {
//        movie.CheckMovieName("Ekhragiha");


    }

    @Test
    void TicketAmountIsMoreThanUserAmount() {

    }

    @Test
    void TicketSoldOut() {

    }

    @Test
    void AmountDecreaseAfterSuccessfulPurchase() {

    }

    @Test
    void CalculateCorrectPurchase() {

    }

}
