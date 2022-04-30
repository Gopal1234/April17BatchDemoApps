package dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Customer;
import service.CustomerService;

public class CustomerImpl  implements CustomerService{

	 List<Customer> listOfCustomers;
	@Override
	public void addCustomer(List<Customer> listOfCustomer) {
		   this.listOfCustomers=listOfCustomer;
	}

	@Override
	public List<Customer> viewCustomer() {
	
		return listOfCustomers;
	}

	@Override
	public Customer removeCustomer(int custId) {

      for(int i=0; i<listOfCustomers.size(); i++)
      {
    	  //[custObj1{1, a , 123, abc}, custObj2{2, b, 345, pqr}, custObj3{3, c, 567, dsds}]
    	  Customer custObj=listOfCustomers.get(i);
    	  
    	  
    	  if(custObj.getCustId()==custId)
    	  {
    		Customer customerObj = listOfCustomers.remove(i);
    		 return customerObj ;
    	  }
    	  
    	  
      }
		
		
		
		return new Customer(0, null, 0, null);
	}

	@Override
	public Customer serachCustomer(int customerId) {


		for(int i=0; i<listOfCustomers.size(); i++)
		{
			if(customerId==listOfCustomers.get(i).getCustId())
			{
				return listOfCustomers.get(i);
			}
		}
		
		
		return null;
	}

	@Override
	public List<Customer> sortCustomerById() {

		//Comparable ---java.lang--e1.compareTo(e2)
	/*	List<Integer> list1=new ArrayList();
		list1.add(10);
		list1.add(1);
		list1.add(20);
		list1.add(5);
		//1 5 10 20
		Collections.sort(list1);;*/
		
		
Collections.sort(listOfCustomers);
		
		return listOfCustomers;
	}

	@Override
	public Customer updateCustomer(int custId) {

//based on the customer id update the customer phone number
		for(int i=0; i<listOfCustomers.size(); i++)
		{
			if(custId==listOfCustomers.get(i).getCustId())
			{
				Customer customer=listOfCustomers.get(i);
				customer.setCustPhone(8147117572L);
				return customer;
			}
		}
		
		
		return null;
	}

}
