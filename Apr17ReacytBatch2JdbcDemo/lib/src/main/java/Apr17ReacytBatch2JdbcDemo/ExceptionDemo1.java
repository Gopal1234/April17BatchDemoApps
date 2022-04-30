package Apr17ReacytBatch2JdbcDemo;

import java.io.IOException;

class UserNotFoundException extends Exception
{

	public UserNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserNotFoundException(String errorMas) {
		super(errorMas);
		// TODO Auto-generated constructor stub
	}

}
public class ExceptionDemo1 {
	/*
	 * public : within the package any where { class, subclass, outside of the class } and outside of the package
	 * protected: within the package any where and only sub class object can access 
	 * private :within in class..we can encapsutaion
	 * default:within the pack any where but not from outside of the package
	 * 
	 * static
	 * one copy created and that will be shared by all object
	 * get intialzed with zero
	 * 
	 *    []
	 *    [][]
	 * final: to restrict overriding
	 *      class final
	 *      interface  no ----we creating interface to overriding
	 *      /*
	 *         interface LoginService
	 *         {
	 *         
	 *         //public static final 
	 *        long accountNumber=124344545;
	 *          
	 *         boolean LoginForCustomer(Customer customer)throws LoginException
	 *         
	 *         }
	 *         //we can inherit interface
	 *         
	 *      
	 *      class CustomerService implements LoginService
	 *      {
	 *      boolean LoginForCustomer(Customer customer)throws LoginException
	 *      }
	 *      class EmployeeService implements LoginService
	 *      {
	 *      boolean LoginForCustomer(Customer customer)throws LoginException
	 *      }
	 *      /
	 
	 *      //LoginService=new CustomerServcice();
	 *      loginservice=new EmployeeeService();
	 *      */
	/*
	 * abstarct class is better than interface
	 * 
	 * */
	
	
	
	two service
	//login
	//checking pin number
	ineterface login
	{
		login();
		
		default void show()
		{
			
		}
		
		
	}
	interfacecheckPin 
	{
		checkPin()
		{
			
		}
		checkPin()
	}

	
	abstract class Bank implements login, checkPin
	{
		//by default 
		double amt=2000.00;
		//
		protected Bank()
		{
			System.out.println("Welcome to RBI");
		}
	//protected and abstract	
	abstract double	deposit(double amt);
		
	}
	 * 
	 *      variable
	 *      method
	 *      properties
	 *       
	    synchronization
	 * 
	 return type
			 //class ,interafce, all printimi
	 * public void  get20()
	 {
		 int c=a+b;
		 retun c;
	 }
	 * get20()---
	  int  c=withObjectOfSomeClass.get20();
	 */
	 class A
	// accessspecifier non-access specifier return type method name(parmaters)thorw Exception
	public boolean Login(String user, String password)throws  UserNotFoundException, ArithmeticException,IOException
	{
		
		if(user.equals("ABC") && password.equals("123"))
		{
		return true;
		}
	throw new UserNotFoundException("Login Problem");
		
	}
	
	 main()throws UserNotFoubdException
	 {
		 //if(any boolean expression)
		 //whether methods are static or non static
		 //if not static we have create object
		 //how many parameters and type of parameters)
		 //Handling exception
		 //try catch
		 //print Login Problem
		 
		 
		 A a=new A();
		 boolean b=a.Login("Gopal","123");
		try
		{
		if(a. Login("Gopal","ABC"));
	 }catch(UserNotFoundException e)
		 {
		 //String errorMessge "Login Problem"
		 //whiche line number, thread , which method
			 System.out.printn(e.getStackTrace())
		 }
	 }
	

}
