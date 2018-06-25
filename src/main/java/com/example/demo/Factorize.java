package com.example.demo;

public class Factorize { 

    public String of(int input) {
        String result = "";
        for (int start = 2;input % start == 0;input /= start) {
            result += start;
        }
        return result;
    }

}
