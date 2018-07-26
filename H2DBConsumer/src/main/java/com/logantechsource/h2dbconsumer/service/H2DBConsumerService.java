package com.logantechsource.h2dbconsumer.service;

import java.util.List;

import com.logantechsource.h2dbconsumer.model.Employee;

public interface H2DBConsumerService {
	public List<Employee> getEmployeeList();
	public List<Employee> addEmployee(String empName);
}
