package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.CustoemrImpl2;
import dao.CustomerImpl;
import model.Customer;
import service.CustomerService;

public class CustomerMain {

	public static void main(String[] args) {

CustomerService service=new CustomerImpl();
//service=new CustoemrImpl2();
//CustomerImpl serice=new CustomerInpl();
//new ArrayList()
//new LinkedList()
//new Stack()
List<Customer> listOfCust=new ArrayList();
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the number of Customer");
int nofCust=Integer.parseInt(scanner.nextLine());//3
for(int i=0; i<nofCust; i++)
{
	System.out.println("Enter id");
	int id=Integer.parseInt(scanner.nextLine());//1 //2
	System.out.println("Enter name");//a//b
	String name=scanner.nextLine();
	System.out.println("Enter phone");//123//345
	long ph=Long.parseLong(scanner.nextLine());
	System.out.println("Enter Email");//xyz//pqr
	String email=scanner.nextLine();
	/*
	 * customer.setCustId();
	 * customer--->obj1
	 * customer--->obj2
	 * customer--->obj3
	 * 
	 */
	Customer customer=new Customer(id, name, ph, email) ;//custObj{1,a,123,xyz}//custObj2{2,b,345,pqr}
	listOfCust.add(customer);
}
//adding list of customer by invoking addCustomer() method of CustomerImpl class

 service.addCustomer(listOfCust);
 
 //view Customer
 
 List<Customer> viewListOfCustomer=service.viewCustomer();

for(Customer custObj:viewListOfCustomer)
{
	
	System.out.println(custObj.getCustId() + " "+custObj.getCustName()+ " "+custObj.getCustPhone() +custObj.getCustEmail());
	
	
	
}
System.out.println("After sorting");
 List<Customer> sortedList= service.sortCustomerById();
Iterator<Customer> itr=sortedList.iterator();
		
	while(itr.hasNext())
	{
		Customer custObj=itr.next();
		System.out.println(custObj.getCustId() + " "+custObj.getCustName()+ " "+custObj.getCustPhone() +custObj.getCustEmail());
		
		
	}
	
	System.out.println("Going to Remove customer by id...");
	System.out.println("Enter customer id");
	int removeId=Integer.parseInt(scanner.nextLine());//1
Customer obj=	service.removeCustomer(removeId);
	
	if(obj!=null)
	{
		System.out.println(obj.getCustName() + " "+obj.getCustPhone());
	}
	System.out.println("Going to search customer by id...");
	System.out.println("Enter customer id");
	int searchId=Integer.parseInt(scanner.nextLine());
Customer obj1=	service.serachCustomer(searchId);
	
	if(obj1!=null)
	{
		System.out.println(obj1.getCustName() + " "+obj1.getCustPhone() + " "+obj1.getCustEmail());
	}
	else
	{
		System.out.println("customer id not found");
	}
		
	System.out.println("Going to update customer phone by id...");
	System.out.println("Enter customer id");
	int updateId=Integer.parseInt(scanner.nextLine());
Customer obj2=	service.updateCustomer(updateId);
	
	if(obj2!=null)
	{
		System.out.println(obj2.getCustName() + " "+obj2.getCustPhone() + " "+obj2.getCustEmail());
	}
	else
	{
		System.out.println("customer id not found");
	}
		
		
		
	}

}
