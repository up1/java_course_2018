package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FizzBuzz {
    
    public static void main(String[] args) {
        int[] datas = {1, 2, 3, 4, 5};
        int length = datas.length;
        for (int i = 0; i < length; i++) {
            System.out.println(datas[i]);
        }
        // foreach
        int i=0;
        for (int data : datas) {
            System.out.println(data);
            i++;
        }
       
        
    }

    private String result;
    
    public String say2(int input) {
        int[] numbers = {15, 3, 5};
        String[] results = {"FizzBuzz", "Fizz", "Buzz"};
        
        for (int i = 0; i < numbers.length; i++) { 
            if(input%numbers[i] == 0) 
                return results[i]; 
        }
        
        return String.valueOf(input);
    }

    public String say(int input) {
        // Register conditions
        List<Condition> conditions = new ArrayList<>();
        conditions.add(new FizzBuzzCondition());
        conditions.add(new FizzCondition());
        conditions.add(new BuzzCondition());
        conditions.add(new KBTGCondition());
        
        // Process
        for (Condition condition : conditions) {
            if(condition.check(input)) {
                return condition.say();
            }
        }
        return String.valueOf(input);
        
//        return (input == 15) ? "FizzBuzz"
//                : หารสามลงตัว(input) ? "Fizz" 
//                        : หารห้าลงตัว(input) ? "Buzz" 
//                                : String.valueOf(input);
    }

    private boolean หารห้าลงตัว(int input) {
        return input % 5 == 0;
    }

    private boolean หารสามลงตัว(int input) {
        return input % 3 == 0;
    }

}
