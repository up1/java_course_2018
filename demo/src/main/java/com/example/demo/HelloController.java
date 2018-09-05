package com.example.demo;

import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	private EmployeeRepository repository;
	
	public void setRepository(EmployeeRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/hello/{name}")
	public HelloResponse sayHi(
			@PathVariable String name) {
		
		// TODO :: call service/repository
		Optional<Employee> result = 
				repository.findById(1);
		
		return new HelloResponse(
				"Hello, "+ result.get().getName());
	}
	
	@PostConstruct
	public void initData() {
		Employee temp = new Employee();
		temp.setName("somkiat");
		repository.save(temp);
	}
	
}
