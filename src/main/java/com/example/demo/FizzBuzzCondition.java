package com.example.demo;

public class FizzBuzzCondition implements Condition {

    public boolean check(int input) {
        return input == 15;
    }

    public String say(int input) {
        return "FizzBuzz";
    }

}
