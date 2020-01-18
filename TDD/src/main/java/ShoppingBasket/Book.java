package ShoppingBasket;

import lombok.Getter;

@Getter
public class Book {
    private String title;
    private String autorName;
    private double price;

    public Book(String title, String autorName, double price) {
        this.title = title;
        this.autorName = autorName;
        this.price = price;
    }
}
