package books;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.demo.books.Book;

public class OrderTest { 
    
    @Test
    public void createOrderWithOneBook() {
        Book book1 = new Book("H1", 8, 2);
        BookItem bookItem = new BookItem(book1, 1);
        Order order = new Order();
        order.addItem(bookItem);
        order.process();
        
        assertEquals(1, order.getBookAmount());
        assertEquals(8, order.getTotalPrice(), 2);
        assertEquals(0, order.getDiscount(), 2);
        assertEquals(8, order.getNetPrice(), 2);
    }

    @Test
    public void createEmptyOrder() {
        Order order = new Order();
        order.process();
        assertEquals(0, order.getBookAmount());
        assertEquals(0, order.getTotalPrice(), 2);
        assertEquals(0, order.getDiscount(), 2);
        assertEquals(0, order.getNetPrice(), 2);
    }

}
