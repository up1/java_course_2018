package com.example.demo.java8;

import java.util.Arrays;
import java.util.List;

public class DemoJava8 {

    public static void main(String[] args) {
        DemoJava8 demo = new DemoJava8();
        demo.demo01();
    }
    
    private void demo01() {
        List<String> names = Arrays.asList("P1", "P2", "P3");
        for (String name : names) {
            System.out.println(name);
        }
        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);
    }

}
