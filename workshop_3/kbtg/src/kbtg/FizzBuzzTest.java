package kbtg;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	FizzBuzz fb = new FizzBuzz();
	
	@Test
	public void input_1_call_1() {
		String actualResult = fb.call(1);
		assertEquals("1", actualResult); 
	}
	
	@Test
	public void input_2_call_2() {
		String actualResult = fb.call(2);
		assertEquals("2", actualResult);
	}
	
	@Test
	public void input_3_call_Fizz() {
		String actualResult = fb.call(3);
		assertEquals("Fizz", actualResult);
	}
	
	@Test
	public void input_6_call_Fizz() {
		String actualResult = fb.call(6);
		assertEquals("Fizz", actualResult);
	}
	
	@Test
	public void input_4_call_4() {
		String actualResult = fb.call(4);
		assertEquals("4", actualResult);
	}
	
	@Test
	public void input_5_call_Buzz() {
		String actualResult = fb.call(5);
		assertEquals("Buzz", actualResult);
	}
	
//	@Test
//	public void input_15_call_FizzBuzz() {
//		String actualResult = fb.call(15);
//		assertEquals("FizzBuzz", actualResult);
//	}

}
