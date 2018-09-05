package day3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoList {
	
	private static List<Integer> get() {
		List<Integer> ints 
		    = new ArrayList<>();
		return ints;
	}

	public static void main(String[] args) {
		List<Integer> results = get();
		if(!results.isEmpty()) {
			
		}
		
		List<Integer> ints
		 = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		ints.add(1, 3); // index
		
		for(Iterator<Integer> it = ints.iterator();
				it.hasNext();) {
			System.out.println(">" + it.next());
		}
		
		for (Integer i : ints) {
			System.out.println(i);
		}
		
		int size = ints.size();
		for (int i = 0; i < size; i++) {
			Integer x = ints.get(i);
			System.out.println(x);
		}
		
		ints.forEach(System.out::println);
	}

}
