package model;

import java.util.Comparator;
/*
 * Comparable<interface> compareTo(Object obj) 
 * Comparator<interface> java.util.---compare(Object obj1, Object obj2)
 * 
 */

public class SortBasedOnDate  implements Comparator<Flight>{

	@Override
	public int compare(Flight f1, Flight f2) {

/*
 * if(07/02/2022.before(08/02/2022)
 * 
 */
		if(f1.getFlyingDate().before(f2.getFlyingDate()))
		{
			return 1;
		}
		
		
		return -1;
	}

}
