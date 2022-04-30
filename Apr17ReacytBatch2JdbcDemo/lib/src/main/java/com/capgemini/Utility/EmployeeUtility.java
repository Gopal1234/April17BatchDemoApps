package com.capgemini.Utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeUtility {
	
	
	public static Connection getConnect()
	{
		Connection con=null;
	
		try
		{
			
			 Class.forName("org.postgresql.Driver");
			
			 con=
			  DriverManager.getConnection("jdbc:postgresql://localhost:5432/Apr7BatchDB", "postgres", "root");		
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		return con;
	}

}
