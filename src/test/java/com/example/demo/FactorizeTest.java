package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorizeTest {

    @Test
    public void case_2() {
        Factorize factorize = new Factorize();
        assertEquals("2", factorize.of(2));
    }
    
    @Test
    public void case_4() {
        Factorize factorize = new Factorize();
        assertEquals("22", factorize.of(4));
    }
    
    @Test
    public void case_8() {
        Factorize factorize = new Factorize();
        assertEquals("222", factorize.of(8));
    }

}
