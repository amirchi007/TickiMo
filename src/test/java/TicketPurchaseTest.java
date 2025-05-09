import org.example.TicketPurchaseService;
import org.example.exceptions.InvalidTicketCountException;
import org.example.exceptions.NotEnoughMoneyException;
import org.example.exceptions.NotEnoughTicketsException;
import org.example.exceptions.NotFoundMovieException;
import org.example.model.Movie;
import org.example.repo.MovieListRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TicketPurchaseTest {

    TicketPurchaseService service;

    @BeforeEach
    public void setUp() {
        service = new TicketPurchaseService(new MovieListRepo());
    }

    @Test
    public void SuccessfulPurchase() throws NotEnoughMoneyException, NotEnoughTicketsException, InvalidTicketCountException {
        double success = service.purchase("Inception", 2, 200);
        assertEquals(100, success);
    }

    @Test
    void MovieIsNotExist() {
        assertThrows(NotFoundMovieException.class, () -> service.purchase("Ekhrajiha", 1, 100));
    }

    @Test
    void NotEnoughMoney() {
        assertThrows(NotEnoughMoneyException.class, () -> service.purchase("Avatar", 1, 1));
    }

    @Test
    void NotEnoughTicket() {
        assertThrows(NotEnoughTicketsException.class, () -> service.purchase("Interstellar", 1000, 100000));
    }

}
