package setDemos;

import java.util.HashSet;
import java.util.Set;

public class TestSetDemo2 {

	public static void main(String[] args) {

		
	        Set<String> set1 = new HashSet<String>();
	  
	      
	        set1.add("Welcome");
	        set1.add("To");
	        set1.add("Capgemini");
	     
	 
	   
	        System.out.println("HashSet contains: " + set1);
	  
	        
	       
	        
	       for(String str: set1)
	       {
	    	   System.out.println(str);
	       }
	  
	        
	        String[]  satticSet = set1.toArray(new String[set1.size()]);
	  
	       
	        System.out.println("Element at index 1 is: "
	                           +satticSet[1]);
	    }


	}


