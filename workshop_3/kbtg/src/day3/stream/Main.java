package day3.stream;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(5);
		numbers.stream()
		   .filter(i -> i%2==0)
		   .forEach(System.out::println);
		numbers.stream()
		   .filter(i -> i%2!=0)
		   .forEach(System.out::println);
//		List<Integer> results = new ArrayList<>();
//		for (Integer i : numbers) {
//			if (i % 2 != 0) {
//				results.add(i);
//			}
//		}
//		results.forEach(System.out::println);

	}

}
