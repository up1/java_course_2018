package day4.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {

	public static void main(String[] args) {
		String[] names = {"P", "U", "I", "S", "O", null};
		Stream<String> namesStream = Arrays.stream(names);
		
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
			}
		};
//				(s1, s2) -> s2.compareTo(s1);
		List<String> result = namesStream
		  .filter(s -> s != null)
		  .map(String::toLowerCase)
		  .sorted(comparator)
		  .collect(Collectors.toList());
		
		result.forEach(System.out::println);

	}

}
