package day2.bookstore;

public class BookStore {

	public static void main(String[] args) {
		Order order = createOrder();
		double totalPrice = PriceCalculator.of(order);
		double discount = DiscountCalculator.of(order);
		order.setTotalPrice(totalPrice);
		order.setDiscount(discount);
		System.out.println(order.getNetPrice());
	}

	private static Order createOrder() {
		Order order = new Order();
		order.addBook(
				new Book(1, "Harry Potter 1", 8), 1);
		order.addBook(
				new Book(2, "Harry Potter 1", 8), 2);
		return order;
	}

}
