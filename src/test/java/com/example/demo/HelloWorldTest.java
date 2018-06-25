package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test public void 
	สวัสดี_somkiat_when_input_is_somkiat() {
		Reception reception = new Reception();
		String actualResult = reception.get("somkiat");
		assertEquals("สวัสดี somkiat", actualResult);
	}
	
	@Test public void 
	สวัสดี_tum_when_input_is_tum() {
		Reception reception = new Reception();
		String actualResult = reception.get("tum");
		assertEquals("สวัสดี tum", actualResult);
	}

}
