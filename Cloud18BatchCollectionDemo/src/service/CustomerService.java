package service;

import java.util.List;

import model.Customer;

public interface CustomerService {
	
	//List<String>
	//List<Integer>
	public void addCustomer(List<Customer> listOfCustomer);
	
	public List<Customer> viewCustomer();
	
	
	public Customer removeCustomer(int custId);
	
	public Customer serachCustomer(int customerId);
	
	public List<Customer> sortCustomerById();
	
	public Customer updateCustomer(int custId);
	
	
	
	

}
