package com.example.demo;

import java.util.Iterator;

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
    
    public String say(int input) {
        int[] numbers = {15, 3, 5};
        String[] results = {"FizzBuzz", "Fizz", "Buzz"};
        
        for (int i = 0; i < numbers.length; i++) { 
            if(input%numbers[i] == 0) 
                return results[i]; 
        }
        
        return String.valueOf(input);
    }

    public String say1(int input) {
        result = String.valueOf(input);
        if (input == 15) {
            result = "FizzBuzz";
        } else if (หารสามลงตัว(input)) {
            result = "Fizz";
        } else if (หารห้าลงตัว(input)) {
            result = "Buzz";
        }
        return result;
        
        
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
