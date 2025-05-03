import org.example.model.Movie;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketPurchaseTest {

    Movie movie;

    @BeforeEach
    public void setUp() {
        movie = new Movie("The Hobbit", 1995, 3);
    }

    @Test
    void SuccessfulPurchase() {
//        movie.Purchase(1,5);
    }

    @Test
    void MovieIsNotExist() {

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
