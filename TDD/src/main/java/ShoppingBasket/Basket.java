package ShoppingBasket;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Book> bookBasket = new ArrayList<>();

    Book createBook(String title, String autorName, double price) {
        return new Book(title, autorName, price);
    }

    void addBook(Book book) {
        bookBasket.add(book);
    }

    void clearBasket() {
        bookBasket.clear();
    }
}
