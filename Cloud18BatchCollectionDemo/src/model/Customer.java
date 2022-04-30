package model;
//customerObj---{custid,custname,custphone,custemial, gettter()
public class Customer implements Comparable<Customer> {
	
	private int custId=10;
	private String custName="ABC";
	private long custPhone=2233;
	private String custEmail="abc@gmail.com";
	//we can define parameterized constructor
	//we can define setters method
	
	
	
	public Customer(int custId, String custName, long custPhone, String custEmail) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custPhone = custPhone;
		this.custEmail = custEmail;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public void setCustPhone(long custPhone) {
		this.custPhone = custPhone;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public int getCustId() {
		return custId;
	}
	public String getCustName() {
		return custName;
	}
	public long getCustPhone() {
		return custPhone;
	}
	public String getCustEmail() {
		return custEmail;
	}
	
	@Override
	public int compareTo(Customer cust) {
//Customer cust=(Customer)obj;
		//(obj) 1 (this)10 3 4
		
   if(cust.custId < this.custId)
   {
	   return 1;
   }
		return -1;
	}
	
	
	

}
