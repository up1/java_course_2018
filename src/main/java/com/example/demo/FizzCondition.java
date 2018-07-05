package com.example.demo;

public class FizzCondition implements Condition {

    public boolean check(int input) {
        return input%3 == 0;
    }

    public String say(int input) {
        return "Fizz";
    }

}
