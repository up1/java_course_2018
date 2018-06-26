package books;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.demo.books.Book;

public class OrderTest { 
    
    @Test
    public void createOrderWithThreeBook() {
        Book book1 = new Book("H1", 8, 2);
        Book book2 = new Book("H2", 8, 2);
        Book book3 = new Book("H3", 8, 2);
        BookItem bookItem1 = new BookItem(book1, 1);
        BookItem bookItem2 = new BookItem(book2, 1);
        BookItem bookItem3 = new BookItem(book3, 1);
        Order order = new Order();
        order.addItem(bookItem1);
        order.addItem(bookItem2);
        order.addItem(bookItem3);
        order.process();
        
        assertEquals(3, order.getBookAmount());
        assertEquals(24, order.getTotalPrice(), 0.00);
        assertEquals("Discount not correct", 24 * 0.1, order.getDiscount(), 0.00);
        assertEquals(24 - (24 * 0.1), order.getNetPrice(), 0.00);
    }
    
    
    @Test
    public void createOrderWithTwoBook() {
        Book book1 = new Book("H1", 8, 2);
        Book book2 = new Book("H2", 8, 2);
        BookItem bookItem1 = new BookItem(book1, 1);
        BookItem bookItem2 = new BookItem(book2, 1);
        Order order = new Order();
        order.addItem(bookItem1);
        order.addItem(bookItem2);
        order.process();
        
        assertEquals(2, order.getBookAmount());
        assertEquals(16, order.getTotalPrice(), 0.00);
        assertEquals("Discount not correct", 16 * 0.05, order.getDiscount(), 0.00);
        assertEquals(16 - (16 * 0.05), order.getNetPrice(), 0.00);
    }
    
    @Test
    public void createOrderWithOneBook() {
        Book book1 = new Book("H1", 8, 2);
        BookItem bookItem = new BookItem(book1, 1);
        Order order = new Order();
        order.addItem(bookItem);
        order.process();
        
        assertEquals(1, order.getBookAmount());
        assertEquals(8, order.getTotalPrice(), 0.00);
        assertEquals(0, order.getDiscount(), 0.00);
        assertEquals(8, order.getNetPrice(), 0.00);
    }

    @Test
    public void createEmptyOrder() {
        Order order = new Order();
        order.process();
        assertEquals(0, order.getBookAmount());
        assertEquals(0, order.getTotalPrice(), 0.00);
        assertEquals(0, order.getDiscount(), 0.00);
        assertEquals(0, order.getNetPrice(), 0.00);
    }

}
