package day3.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.demo1();
	}

	private void demo1() {
		Employee e1 = new Employee(1, "One");
		Employee e2 = new Employee(2, "Two");
		Employee e3 = new Employee(3, "Three");
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e2);
		employees.add(e1);
		employees.add(e3);
		
		employees.forEach(System.out::println);
		Comparator<Employee> comparator =
				new Comparator<Employee>() {
					@Override
					public int compare(Employee e1, Employee e2) {
						return e1.getId() - e2.getId();
					}
				};
				
		Comparator<Employee> comparator2 =
				(Employee t1, Employee t2) ->
					t1.getId() - t2.getId();
		
		Collections.sort(employees, comparator2);
		employees.forEach(System.out::println);
	}

}
