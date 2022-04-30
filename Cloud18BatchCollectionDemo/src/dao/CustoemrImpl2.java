package dao;

import java.util.Collections;
import java.util.List;

import model.Customer;
import service.CustomerService;

public class CustoemrImpl2 implements CustomerService {

	private List<Customer> lisCustomers;
	@Override
	public void addCustomer(List<Customer> listOfCustomer) {
		// TODO Auto-generated method stub
		this.lisCustomers=listOfCustomer;
		
	}

	@Override
	public List<Customer> viewCustomer() {
		// TODO Auto-generated method stub
		return lisCustomers;
	}

	@Override
	public Customer removeCustomer(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer serachCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> sortCustomerById() {
		// TODO Auto-generated method stub
		
		
		
	Collections.sort(lisCustomers);
	return lisCustomers;
	}

	@Override
	public Customer updateCustomer(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

}
