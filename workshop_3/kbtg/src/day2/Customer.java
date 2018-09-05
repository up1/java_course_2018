package day2;

class XXX {
	void call() {
		
		Customer customer 
		    = new CustomerBuilder()
		    .assignId("1")
		    .setName("somkiat")
		    .build();
	}
}

// Builder pattern
class CustomerBuilder {
	private Customer currentCustomer;
	public Customer build() {
		return currentCustomer;
	}
	
	public CustomerBuilder() {
		currentCustomer = new Customer();
	}
	public CustomerBuilder assignId(String id) {
		//currentCustomer.set
		return this;
	}
	public CustomerBuilder setName(String name) {
		//currentCustomer.set
		return this;
	}
}

class IndividualCustomer extends Customer {
	
}

public class Customer extends Object {
	private String id;
	private String name;
	
	public static void main(String[] args) {
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c1.equals(c2));
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

	public Customer() {
		this("random id");
	}

	private Customer(String id) {
		this.id = id;
	}

	// Setter/Getter methods
	public void ฝากเงิน() {

	}

	private void internal() {

	}

}
