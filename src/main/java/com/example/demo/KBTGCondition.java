package com.example.demo;

public class KBTGCondition implements Condition {

    @Override
    public boolean check(int input) {
        return input%7 ==0;
    }

    @Override
    public String say() {
        return "KBTG";
    }

}
