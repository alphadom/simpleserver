package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping(value="/getEmp")
	public Employee getEmp()
	{
		Employee e1 = new Employee(100, "shanganesh");
		return e1;
	}

}
