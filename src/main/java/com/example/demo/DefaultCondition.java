package com.example.demo;

public class DefaultCondition implements Condition {

    @Override
    public boolean check(int input) {
        return true;
    }

    @Override
    public String say(int input) {
        return String.valueOf(input);
    }

}
