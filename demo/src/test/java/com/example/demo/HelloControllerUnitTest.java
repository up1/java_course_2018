package com.example.demo;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class HelloControllerUnitTest {
	
	@Mock
	public EmployeeRepository employeeRepository;

	@Test
	public void test() {
		HelloController controller = new HelloController();
		MockitoAnnotations.initMocks(this);
		controller.setRepository(employeeRepository);
		
		Employee employee = new Employee();
		employee.setName("somkiat");
		BDDMockito.given(employeeRepository.findById(1))
		     .willReturn(Optional.of(employee));
		
		
		HelloResponse actualResponse = controller.sayHi("somkiat");
		assertEquals("Hello, somkiat", actualResponse.getMessage());
	}

}
