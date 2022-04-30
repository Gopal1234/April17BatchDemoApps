package listDemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class TestListDemo1 {

	public static void main(String[] args) {

		//we can not able to store primitive data types into collection	
		/*
		 * Wrapper classes
		 * 
		 * int ----Integer<class>
		 * float----Float<class>
		 * double----Double<class>
		 * byte---Byte<class>
		 * char---Character<class>
		 * 
		 * 
		 * 
		 */

		/*int a=10;
		Integer i1=new Integer(a);
System.out.println(		i1.doubleValue());
System.out.println(i1.BYTES);
System.out.println(i1.SIZE);
System.out.println(Integer.toBinaryString(i1));

		System.out.println(i1);
		
		Integer j=new Integer(100);
		int t=j;
		System.out.println(t);*/
		/*
		 * ArryList();
		 * LinkedList();
		 * Stack<class>
		 * Vector<class>
		 * 10
		 * 1 2 3 4 5 6 78 
		 * 15
		 * 
		 */
		
		ArrayList al=new ArrayList();
		//al=new LinkedList();
		al.add(122);
		List list1=new  ArrayList();
		/*list1=new LinkedList();
				list1=new Stack();
		list1=new Vector();*/
	/*	list1=new LinkedList();
		list1=new Stack();
		list1=new Vector();*/
		//size() ---int
		System.out.println(list1.size());
		
		//add(Object obj)--boolean
		list1.add(10);//0
		list1.add("Gopal");//1
		list1.add(567.89);//2
		list1.add(true);//3
		System.out.println(list1.size());

		 //contains(Object obj)---boolean
	boolean b=	list1.contains("Gopal");
	System.out.println(b);	
	if(b)
	{
		//remove(int index)---Object
		//remove(Object obj)---boolean
	//Object obj=	list1.remove(1);
		
		if(list1.remove("Gopal"))
		{
			System.out.println("The object has been removed");
		}
	//System.out.println(obj);
	}
		System.out.println(list1);
		
		//update my collection
		//set(int index, Object)
		list1.set(0, "Ravi");
		System.out.println(list1);
		
		for(int i=0; i<list1.size(); i++)
		{
			//get(int index)---Object
			System.out.println(list1.get(i));
		}
		
		System.out.println("accessing using for each loop");
		//10, true
		for(Object obj: list1)
		{
			System.out.println(obj);
		}
		
		/*
		 * Iterator<interface>
		 * |
		 * hashNext()--boolean
		 * next()---Ojecct
		 * remove()--void
		 * 
		 * 
		 * interface Iterator
		 * {
		 * 
		 * }
		 * class DummyClass implements Itretor
		 * {
		 * 
		 * 
		 * 
		 * }
		 * 
		 *Iterator itreator()
		 * {
		 * new DummyClass();
		 * }
		 */
		Iterator itr=list1.iterator();
		/*
		 * hashNext()---boolean
		 * next()---Object
		 * remove()--void
		 * 
		 * 
		 * 
		 */
		while(itr.hasNext())
		{
		Object obj=	itr.next();
		System.out.println(obj);
		itr.remove();
		
		}
		
		System.out.println(list1.size());
	}

}
