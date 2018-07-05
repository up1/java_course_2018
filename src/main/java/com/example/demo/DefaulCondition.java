package com.example.demo;

public class DefaulCondition implements Condition {

    @Override
    public boolean check(int input) {
        return true;
    }

    @Override
    public String say(int input) {
        return String.valueOf(input);
    }

}
