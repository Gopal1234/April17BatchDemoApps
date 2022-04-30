package com.capgemini.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.dao.EmployeeServiceImpl;
import com.capgemini.model.Employee;
import com.capgemini.service.EmployeeService;

public class Main {
	public static void main(String[] args) {
		EmployeeService service=new EmployeeServiceImpl();
		Scanner scanner=new Scanner(System.in);
		int nOE=Integer.parseInt(scanner.nextLine());
		for(int i=0; i<nOE; i++)
		{
			Employee e=new Employee();
			System.out.println("Enter id");
			int id=Integer.parseInt(scanner.nextLine());
			System.out.println("Enter name");
			String eName=scanner.nextLine();
			System.out.println("Enter salary");
		double salary=Double.parseDouble(scanner.nextLine());
			System.out.println("Enter phone");
			long phone=Long.parseLong(scanner.nextLine());
			e.setEmpId(id);
			e.setEmpName(eName);
			e.setEmpPhone(phone);
			e.setEmpSalary(salary);
			if(service.addEmployee(e))
			{
				System.out.println(i+1 + " "+"object inserted");
			}
			
			
		}
		
		//calling getAllEmployee()
		 List<Employee> listOfEmp=   service.getAllEmployee();
		for(Employee e: listOfEmp)
		{
			
			System.out.println(e.getEmpId() + " "+e.getEmpPhone() + " "+e.getEmpSalary()+ " "+e.getEmpName());
		}
		
		System.out.println("delete employee object based on id");
		int id=Integer.parseInt(scanner.nextLine());
	int k=	service.deleteEmployeeById(id);
	if(k>0)
	{
		System.out.println("deleted");
	}
		
		
	}

}
