package books;

import com.example.demo.books.Book;

public class BookBuilder {

    private String name;
    private int price;

    public BookBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public BookBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public Book build() {
        return new Book(this.name, this.price, 1);
    }

}
