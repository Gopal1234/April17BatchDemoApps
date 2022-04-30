package mapDemos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * java.util
 * |
 * Iterable<Interface>
 * |
 * Collection<interface>
 * |
 * List<interface>  Set<interface>
 * |                   |
 *                      HashSet<class>
 *                      LinkedHashSet<class>
 *                      |
 *                      SortedSet<interface>
 *                       |
 *                       NavigableSet<interface>
 *                        |
 *                        TreeSet<class>
 * ArrayList<class>
 * LinkedList<class>
 * 
 *    java.util.*
 *    |
 *   Map<interface><Key, Value>
 *   put(Object key, Object value)-- 
 *    *   putAll(Map m)--boolean
 *   size()--int
 *   get(Object key)---Object as Value
 *   remove(Object key)--Object as Value
 *   remove(Object key, Object value)---boolean
 *   keySet()--Set<Key object>
 *   entrySet() --Set<k,v>
 *   (123, 
 *   replace<Object key, Object value>
 *   containKey(Object key)--boolean
 *   containsValue(Object value)--boolean
 *    |
 *    
 * HashMap<class>
 * LinkedHashMap
 * 
 *   |
 *   TreeMap
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class TestMapDemo1 {

	public static void main(String[] args) {
		/*
		 * HashMap()--16 and 0.75
		 * HashMap(int initialCapacity)
		 * HashMap(int, float)
		 * HashMap(Map m)
		 * 
		 * 
		 * 
		 */
 Map<Integer, String> m=new HashMap();
		//Map<Integer, String> m=new LinkedHashMap<Integer, String>();
 //Incase of treemap we can not able to store null value as key object
		//Map<Integer, String> m=new TreeMap();
		
  //put(Object key, Object value)
  m.put(1, "A");
  m.put(100, null);
  m.put(null, "B");
  m.put(7, null);
  m.put(null, "A");
 //size() --int 
  System.out.println("Map Size"+ " "+m.size());
  System.out.println(m);
  /*
   * contains(Object obj)--boolean
   * 
   * 
   */
  
  //conatinskey(Object key)---boolean and constainsValue(Object value)---boolean
 //boolean b= m.containsKey(7);
 boolean b= m.containsValue("D");
 System.out.println(b);
	if(b)
	{
	
		//keySet()---Set<Object key)
	Set<Integer> keyValues=	m.keySet();
	Iterator<Integer> itr=keyValues.iterator();
	while(itr.hasNext())
	{
		int key=itr.next();
		//get(Object key)---Object value
		System.out.println(key + "--->"+m.get(key));
	}
	
	}else
	{
		System.out.println("The key object is not present in map");
	}
		
		
		

	}

}
