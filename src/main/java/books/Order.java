package books;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int bookAmount;
    private double totalPrice;
    private double discount;
    private double netPrice;

    public int getBookAmount() {
        return this.bookAmount;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public double getDiscount() {
        return this.discount;
    }

    public double getNetPrice() {
        return this.netPrice;
    }

    private List<BookItem> bookItem = new ArrayList<>();
    public void addItem(BookItem bookItem) {
        this.bookItem.add(bookItem);
    }

    public void process() {
//        if(this.bookItem != null && this.bookItem.size() > 0) {
        if(!this.bookItem.isEmpty()) {
            // Book amount = size of order
            this.bookAmount = this.bookItem.size();
            
            // Calculate price
//            this.totalPrice = bookItem.getBook().getPrice();
            // Law of demeter :: https://en.wikipedia.org/wiki/Law_of_Demeter
            for (BookItem book : bookItem) {
                this.totalPrice += book.getTotalPrice();
            }
            
            // Calculate discount
            this.discount = 0;
            if(getBookAmount() == 2) {
                this.discount = getTotalPrice() * 0.05;
            }
            
            // Calculate net price
            this.netPrice = getTotalPrice() - getDiscount();
        }
    }


    
}
