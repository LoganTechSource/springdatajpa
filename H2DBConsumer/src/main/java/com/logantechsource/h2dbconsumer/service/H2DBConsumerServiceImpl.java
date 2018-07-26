package com.logantechsource.h2dbconsumer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logantechsource.h2dbconsumer.model.Employee;

@Service
public class H2DBConsumerServiceImpl implements H2DBConsumerService{

	@Autowired
	private H2DBConsumerRestService h2dbConsumerRestService; 
	
	@Override
	public List<Employee> getEmployeeList() {
		return h2dbConsumerRestService.getEmployeeList();
	}

	@Override
	public List<Employee> addEmployee(String empName) {
		
		return h2dbConsumerRestService.addEmployee(empName);
	}
	
}
