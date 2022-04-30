package setDemos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set is sub interface of Collection
 * Set allow only unique elements to store
 * 
 *     Set<interface>
 *      |
 *      HashSet<class>
 *      
 *      
 *      i.HashSet() -16 and default load factor 0.75
 *      equals()
 *      "hello".hashCode()--100%16-4
 *      
 *         ["hello"]-0
 *         
 *         []-1
 *         []-2
 *         []
 *         ["helllo"]
 *         []
 *         []
 *      new HashSet()
 *      {
 *      
 *      new HashMap()
 *      {
 *      put(key, value)
 *      }
 *      
 *      }
 *      
 *      
 *      
 *      ii.HashSet(int capacity)
 *      iii.HashSet(int cap, float loadFactor)
 *      iv.HashSet(Collection collection)
 *      
 *      
 *      
 *      
 *      
 *      
 *      
 *      
 *      LinkedHashSet<class>
 *      |
 *      SortedSet
 *       |
 *       NavigableSet
 *       |
 *       TreeSet<class>
 * 
 * 
 * 
 * 
 * 
 */
public class TestSetDemo1 {

	public static void main(String[] args) {
  Set<Integer> set1=new HashSet(200,0.80f);
  //HashSet hs=new HashSet();
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter the elements into set");
  for(int i=0; i<5; i++)
  {
	  int elements=scanner.nextInt();
	  set1.add(elements);
  }

	System.out.println(set1);	
		System.out.println("LinkedHashSet displaying data");
		set1=new LinkedHashSet<Integer>();
		set1.add(10);
		set1.add(234);
		set1.add(10);
		set1.add(500);
		set1.add(1);
		System.out.println(set1);

		System.out.println("TreeSet displaying data");
		set1=new TreeSet();
		set1.add(10);
		set1.add(234);
		set1.add(10);
		set1.add(500);
		set1.add(1);
		
		System.out.println(set1);
		
		
		
	}

}
