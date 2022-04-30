package listDemos;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * 1000 elements
 * 100
 * 1
 * 0       1    2 3 
 * [obj1][][][][][][][][]
 * 
 * 
 * LinkedList
 * null--[prev][obj1][next]<--->[prev][obj2][next]<---><--->n
 * 
 * 
 * 
 * 
 * 
 */

public class TestLinkedListDemo1 {

	public static void main(String[] args) {
  LinkedList<Integer> list1=new LinkedList<Integer>();
  list1.add(10);//0
  list1.add(50);//1
  list1.add(1);//2
  /*
   * addFirs
   * 
   */
  System.out.println(list1);
  /*
   * get(int index)---Object
   * getFirst()
   * getLast()
   */
  System.out.println(list1.getFirst());
  System.out.println(list1.getLast());
  /*
   * addFirst()
   * addLast()
   * 
   * 
   */
  list1.addFirst(100);
  list1.addLast(500);
  System.out.println(list1);
  
  /*
   * removeFirst()
   * removeLast()
   * 
   * 
   */
  
 list1.removeFirst();
 list1.removeLast();
 System.out.println(list1);
 
 /*
  * ArrayList()
  * ArrayList(Collection collection)
  * 
  * 
  */
 ArrayList<Integer> al=new ArrayList<Integer>(list1);
 al.add(1);
 al.add(20);
 al.add(30);
 /*
  * LinkedList()
  * LinkedList(Coolection collection)
  * 
  * 
  */
 LinkedList list2=new LinkedList(al);
 list2.removeFirst();
 System.out.println(list2);
 /*
  * remove(int index)--Object
  * remove(Object obj)--boolean
  * removeFirst()
  * removeLast()
  * 
  * 
  */
 
 list2.remove(1);
 
  
  System.out.println(list2);
  
  
  
  
  
  

		
		

	}

}
