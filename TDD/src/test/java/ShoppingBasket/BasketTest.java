package ShoppingBasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasketTest {
    private Basket basket;

    @Before
    public void setBasket() {
        basket = new Basket();
    }
    @Test
    public void createBook() {
        //given
        String title = "krzyzacy";
        String autorname = "sienkiewicz";
        double price = 112.5;

        //when
        Book result = basket.createBook(title,autorname,price);

        //then
        assertEquals();
    }

    @Test
    public void addBook() {
    }

    @Test
    public void clearBasket() {
    }
}