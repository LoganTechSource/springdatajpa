package com.logantechsource.h2db.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logantechsource.h2db.entity.Employee;
import com.logantechsource.h2db.repo.EmployeeRepo;

@RestController
@RequestMapping("/h2db/employee")
public class H2DBController {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@GetMapping(value="/list", produces={MediaType.APPLICATION_JSON_VALUE})
	public List<Employee> getEmployeeDetails()
	{
		return employeeRepo.findAll();
	}
	
	@PostMapping(value="/add")
	public List addEmployee(@RequestBody final String empName)
	{
		Employee employee = new Employee();
		employee.setEmpName(empName);
		List<Employee> empList = employeeRepo.findByEmpNameIgnoreCase(empName);
		if(empList.isEmpty())
		{
			employeeRepo.saveAndFlush(employee);
		}
		else
		{
			return new ArrayList<>(Arrays.asList("The employee name " + empName + " already exists"));
		}
		
		return employeeRepo.findByEmpNameIgnoreCase(empName);
	}
}
