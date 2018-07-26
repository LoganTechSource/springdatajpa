package com.logantechsource.h2dbconsumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logantechsource.h2dbconsumer.model.Employee;
import com.logantechsource.h2dbconsumer.service.H2DBConsumerServiceImpl;

@RestController
@RequestMapping("/h2dbconsumer")
public class H2DBConsumerController {

	@Autowired
	private H2DBConsumerServiceImpl h2dbConsumerServiceImpl;
	
	@GetMapping(value="/employees", produces=MediaType.APPLICATION_STREAM_JSON_VALUE)
	public List<Employee> getEmployees()
	{
		return h2dbConsumerServiceImpl.getEmployeeList();
	}
	
	@PostMapping(value="/employee/add")
	public List<Employee> addEmployee(@RequestBody final String empName)
	{
		return h2dbConsumerServiceImpl.addEmployee(empName);
	}

}
