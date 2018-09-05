package day3;

import java.util.Set;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {
		Set<Integer> sets = new TreeSet<>();
		sets.add(1);
		sets.add(2);
		sets.add(1);
		sets.forEach(System.out::println);
	}

}
