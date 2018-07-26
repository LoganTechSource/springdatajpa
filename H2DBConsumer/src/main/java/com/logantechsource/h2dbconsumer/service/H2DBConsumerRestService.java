package com.logantechsource.h2dbconsumer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.logantechsource.h2dbconsumer.model.Employee;

@Service
public class H2DBConsumerRestService {
	private RestTemplate restTemplate = new RestTemplate();
	
	@Value("${h2db.employee.list}")
	private String employeeListURL;
	
	@Value("${h2db.employee.add}")
	private String employeeAddURL;
	
	public List<Employee> getEmployeeList()
	{
		ResponseEntity<List<Employee>> responseEntity = restTemplate.exchange(employeeListURL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Employee>>() {});
		return responseEntity.getBody();
	}
	
	public List<Employee> addEmployee(String empName)
	{
		ResponseEntity<ArrayList> responseEntity = restTemplate.postForEntity(employeeAddURL, empName, ArrayList.class);
		return responseEntity.getBody();
	}
}
