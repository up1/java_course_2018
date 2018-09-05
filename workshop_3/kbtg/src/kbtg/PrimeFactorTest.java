package kbtg;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeFactorTest {
	PrimeFactor pf = new PrimeFactor();
	
	@Test
	public void factor_of_3_should_3() {
		String result = pf.of(3);
		assertEquals("3", result);
	}
	
	@Test
	public void factor_of_9_should_33() {
		String result = pf.of(9);
		assertEquals("33", result);
	}

	@Test
	public void factor_of_2_should_2() {
		String result = pf.of(2);
		assertEquals("2", result);
	}
	
	@Test
	public void factor_of_4_should_22() {
		String result = pf.of(4);
		assertEquals("22", result);
	}
	
	@Test
	public void factor_of_8_should_222() {
		String result = pf.of(8);
		assertEquals("222", result);
	}
}
