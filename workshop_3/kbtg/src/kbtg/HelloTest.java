package kbtg;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {
	
	@Test  
	public void should_return_Hello() {
		Hello hello = new Hello();
		String actualResult = hello.getMessage();
		assertEquals("Hello world", actualResult);
	}

}
