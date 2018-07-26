package com.logantechsource.h2db.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logantechsource.h2db.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{

	List<Employee> findByEmpNameIgnoreCase(String empName);
	
}
