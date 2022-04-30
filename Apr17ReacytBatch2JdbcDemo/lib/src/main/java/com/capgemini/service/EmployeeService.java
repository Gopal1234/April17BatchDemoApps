package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Employee;

public interface EmployeeService {

	//this method will save every employee object into DB
	//once the object sucessfully stored , then it returns boolean
	  boolean addEmployee(Employee e);
	 List<Employee> getAllEmployee();
	  int deleteEmployeeById(int empId);
	  Employee getEmployeeById(int empId);
	int updateEmployeeById(int empId);
	
	
	
	
}
