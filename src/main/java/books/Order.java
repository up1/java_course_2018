package books;

public class Order {

    private BookItem bookItem;
    private int bookAmount;
    private double totalPrice;
    private int discount;
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

    public void addItem(BookItem bookItem) {
        this.bookItem = bookItem;
    }

    public void process() {
        if(this.bookItem != null) {
            this.bookAmount = 1;
            
            // Calculate price
            this.totalPrice = bookItem.getBook().getPrice();
            
            // Calculate discount
            this.discount = 0;
            
            // Calculate net price
            this.netPrice = getTotalPrice() - getDiscount();
        }
    }


    
}
