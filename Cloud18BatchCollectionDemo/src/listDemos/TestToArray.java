package listDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestToArray {

	public static void main(String[] args) {
 /* Integer[] x= new Integer[]{10,20,40,506,70,80};
  //converting array into list
  //Arrays.asList(a)
List<Integer> list1=Arrays.asList(new Double[] {12.8,56,89});

System.out.println(list1);

//converting list into static array
//toArray() of collection
Object[] objArray=list1.toArray();
for(Object obj:objArray)
{
	System.out.println(obj);
}*/
ArrayList<Integer> al1=new ArrayList();
al1.add(10);
al1.add(30);
al1.add(40);
ArrayList<Integer> al2=new ArrayList();
al2.add(10);
al2.add(300);
al2.add(30);



//al1.addAll(al2);
/*for(Integer i: al1)
{
	System.out.println(i);
}*/
/*al1.removeAll(al2);
System.out.println(al1);
System.out.println(al2);*/
//System.out.println("****");
al1.retainAll(al2);
System.out.println(al1);
System.out.println(al2);



	}

}
