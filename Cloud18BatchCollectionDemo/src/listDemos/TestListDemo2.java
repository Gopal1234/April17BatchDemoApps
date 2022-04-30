package listDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Employee
{
	//This list object should store only the string object
	List<String> listOfNames;
	//list<employee>
	List<Double> listOfSalary;
	public List<String> getListOfNames() {
		return listOfNames;
	}
	public void setListOfNames(List<String> listOfNames) {
		this.listOfNames = listOfNames;
	}
	public List<Double> getListOfSalary() {
		return listOfSalary;
	}
	public void setListOfSalary(List<Double> listOfSalary) {
		this.listOfSalary = listOfSalary;
	}
	
	public List<Double> getSalaryInSortedOrder()
	{
		/*
		 *int,s 
		 * class Double implements Comparable
		 * {
		 * 
		 * Comparable and Comparator
		 * interface java.lang.Comparable
		 * {
		 * int comapareTo(Oject obj) 
		 * {
		 *  if(this.propertyName)>obj.pro
		 * 
		 * }
		 * }
		 * 
		 */
		
		//12 , 2,5,70,90
		/*
		 * Integer-- implements Comparable
		 * String
		 * 
		 * 
		 * 
		 * 
		 */
		Collections.sort(listOfSalary);
		
		
		return listOfSalary;
	}
	
	
}




public class TestListDemo2 {

	public static void main(String[] args) {

		Employee emp=new Employee();
		 Scanner scanner=new Scanner(System.in);
		 List<String> listOfNames=new ArrayList();
		 System.out.println("How many nmes do you want to store");
		 int nofEmp=Integer.parseInt(scanner.nextLine());
		 
		 
		 System.out.println("Enter the name into list");
		 for(int i=0; i<nofEmp; i++)
		 {
			 //A B C
			 String name=scanner.nextLine();
			 listOfNames.add(name);
		 }
//invoking the setListOfNames() method
		 emp.setListOfNames(listOfNames);
		 
		 
		 List<Double> listOfSalary=new ArrayList();
		 System.out.println("How many salary do you want to store");
		 int nofEmpSal=Integer.parseInt(scanner.nextLine());
		 
		 
		 System.out.println("Enter the salary into list");
		 for(int i=0; i<nofEmpSal; i++)
		 {
			 double salary=Double.parseDouble(scanner.nextLine());
			 listOfSalary.add(salary);
		 }
		 
		 //invoking the setListOfSalary() method
		 emp.setListOfSalary(listOfSalary);
		 
		 
	List<String> list1=	 emp.getListOfNames();
	Iterator<String> itr=list1.iterator();
	while(itr.hasNext())
	{
		
		//String str=(String)itr.next();
	String str=	itr.next();
		System.out.println(str);
	}
	
	List<Double> listOfSortedSalary=emp.getSalaryInSortedOrder();
	for(Double sal:listOfSortedSalary)
	{
		System.out.println(sal);
	}
	
	List<Double> list2=	 emp.getListOfSalary();
	ArrayList<Double> salaryList=new ArrayList();
	Iterator<Double> itr1=list2.iterator();
	while(itr1.hasNext())
	{
		
		//String str=(String)itr.next();
	Double salary=	itr1.next();
	if(salary>5000.00)
	{
	salaryList.add(salary);	
	}
		System.out.println(salary);
	}
	System.out.println(salaryList);	

	}

}
