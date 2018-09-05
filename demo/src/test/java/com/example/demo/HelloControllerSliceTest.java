package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerSliceTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private EmployeeRepository employeeRepository;

	@Test
	public void test() throws Exception {
		Employee employee = new Employee();
		employee.setName("somkiat");
		BDDMockito.given(employeeRepository.findById(1))
		     .willReturn(Optional.of(employee));
		
		mockMvc.perform(get("/hello/somkiat"))
		.andExpect(status().is(200))
		.andExpect(jsonPath("$.message").value("Hello, somkiat"))
		.andExpect(jsonPath("$.detail.data").value("temp"));
	}

}
