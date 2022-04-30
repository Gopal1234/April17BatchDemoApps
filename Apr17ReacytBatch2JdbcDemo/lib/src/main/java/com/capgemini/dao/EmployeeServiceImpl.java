package com.capgemini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.Utility.EmployeeUtility;
import com.capgemini.model.Employee;
import com.capgemini.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public boolean addEmployee(Employee e)  {
	
		int status=0;
		try
		{
		Connection con=EmployeeUtility.getConnect();
		final String INSERT_EMP="insert into Employee_Table values(?,?,?,?)";
	PreparedStatement ps=	con.prepareStatement(INSERT_EMP);
	ps.setInt(1,e.getEmpId());
	ps.setString(2, e.getEmpName());
	ps.setDouble(3, e.getEmpSalary());
	ps.setLong(4, e.getEmpPhone());
	
	status=ps.executeUpdate();
	
	
		
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
		if(status==1)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public List<Employee> getAllEmployee() {
	
		List<Employee> listOfEmp=new ArrayList<Employee>();
 try
 {
	
		Connection con=EmployeeUtility.getConnect();
		PreparedStatement ps=con.prepareStatement("select * from employee_table");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			int id=rs.getInt("empid");
			String name=rs.getString("empname");
			double salary=rs.getDouble("empsal");
			long phone=rs.getLong(4);
			Employee e=new Employee();
			e.setEmpId(id);
			e.setEmpName(name);
            e.setEmpSalary(salary);
            e.setEmpPhone(phone);
            listOfEmp.add(e);
			
		}
		
		
 }catch(Exception e)
 {
	 System.out.println(e);
 }

		if(listOfEmp.isEmpty())
		{
			return null;
		}
		return listOfEmp;
	}

	@Override
	public int deleteEmployeeById(int empId) {
		int delStatus=0;
		try
		 {
			
				Connection con=EmployeeUtility.getConnect();
				PreparedStatement ps=con.prepareStatement("delete from employee_table where empid=?");
		ps.setInt(1, empId);
	delStatus=	ps.executeUpdate();
		 }catch(Exception e)
		{
			 System.out.println(e);
		}
		
		

		
		return delStatus;
	}

	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
