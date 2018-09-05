package com.example.demo;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeRepositoryTest {
	
	@Autowired
	private EmployeeRepository repository;

	@Test
	public void success_save_and_find_by_id() {
		Employee e1 = new Employee();
		e1.setName("somkiat");
		repository.save(e1);
		
		Optional<Employee> result = 
				repository.findById(1);
		assertEquals(1, result.get().getId());
		assertEquals("somkiat", result.get().getName());
	}

}
