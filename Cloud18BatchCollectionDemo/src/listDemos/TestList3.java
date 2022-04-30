package listDemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList3 {

	public static void main(String[] args) {

		List<String> list=new ArrayList();
		list.add("ABC");
		list.add("Apple");
		list.add("Orange");
		list.add("Orangey");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			String str=itr.next();
			if(str.endsWith("e") || str.endsWith("y"))
			{
			itr.remove();
			
			}
		}
System.out.println(list);
		

	}

}
