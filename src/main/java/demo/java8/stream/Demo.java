package demo.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out; 

public class Demo {

    public static void main(String[] args) {
         String[] datas = new String[] {"P", "U", "I"};
         Stream<String> streams = Arrays.stream(datas);
         streams.forEach(System.out::println);
         
         Stream<String> streams2 = Stream.of("P", "U", "I");
         streams2.forEach(System.out::println);
         
         List<String> myList = Arrays.asList("P", "U", "I");
         myList.stream().forEach(System.out::println);
         myList.parallelStream().forEach(System.out::println);
         
         myList.stream().forEach(System.out::println);
         
         myList.stream()
            .filter(element -> element.contains("P"))
            .forEach(System.out::println);
         
         boolean isValid = myList.stream()
                 .anyMatch(element -> element.contains("P"));
         out.println(isValid);
         
         List<String> results = myList.stream()
                                  .map(element -> element.toLowerCase())
                                  .collect(Collectors.toList());
         out.println(results);
    }

}
