package Apr17ReacytBatch2JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class Employee
{
	
	
	public void display()
	{
		System.out.println("welcome");
	}
}

public class TestJdbcDemo {
	//default value of its type 
	//for all object what is the defualt value null
	//for all integrals defualt values=0;
	static Connection con=null;
	
	public static void main(String[] args) throws SQLException  {
//load the driver
		//service layer
		//all local variables must be initialized with any value

	
		try
		{
  Class.forName("org.postgresql.Driver");
  /*
   * JDBC API
   * 
   * 
   * 
   */
  System.out.println("ok");
  //address
  //user
  //password
  //class A
  //this---
 
  con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Cloud28FebBatchDB", "postgres", "root");		
	System.out.println(new TestJdbcDemo (). con)	;
	Scanner scanner=new Scanner(System.in);
	/*
	 * variablles
	 * me
	 * 
	 * 
	 * 
	 */
	System.out.println("Enter table name");
	String tableName=scanner.nextLine();
	//create table abc(id int not null primary key, name varchar(30));
	final String INSERT="create table" + " "+tableName+"(id int not null primary key, name varchar(40))";
	/*
	 * JDBC
	 * Statement 
	 * PreparedStatement
	 * Callballe statememt
	 * 
	 * 
	 * 
	 * 
	 */
	  Statement s=con.createStatement();
	  //DDLisert, update, delete
	  
	   s.executeUpdate(INSERT);
	
	System.out.println("table created");
		}
	
		catch(ClassNotFoundException ce)
		{
			System.out.println("driver loading problem");
		}
		catch(SQLException sq)
		{
			System.out.println("query proiblen");
		}
		//cleaning our application
		//shut down our app
		
		finally {
			con.close();
			
		}
		
		

	}
	public static void showConnection()
	{
		System.out.println(con);
	}
}

