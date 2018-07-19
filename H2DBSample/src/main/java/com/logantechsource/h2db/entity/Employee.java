package com.logantechsource.h2db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="empid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer empId;
	
	@Column(name="empname")
	String empName;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

	
}
