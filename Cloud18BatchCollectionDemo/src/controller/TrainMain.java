package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import dao.TrainServiceImpl;
import model.Train;
import service.TrainService;

public class TrainMain {

	public static void main(String[] args) {
   TrainService service=new TrainServiceImpl();
 
   Scanner scanner =new Scanner(System.in);
   System.out.println("How many trains do you want to add");
   int noT=Integer.parseInt(scanner.nextLine());//3
   for(int i=0; i<noT; i++)
   {
	   System.out.println("Enter train number");
	   int tno=Integer.parseInt(scanner.nextLine());  
	   System.out.println("Enter train name");
	   String tName=scanner.nextLine();  
	   System.out.println("Enter train source");
	   String tSource=scanner.nextLine();  
	   System.out.println("Enter train destination");
	   String tDest=scanner.nextLine();  
	   System.out.println("Enter the number of Halts");
	   int noS=Integer.parseInt(scanner.nextLine());
	   System.out.println("Enter"+ " "+noS+ ""+"stations");
	   List<String> listOFStations=new ArrayList();
	   for(int j=0; j<noS; j++)
	   {
		   String station=scanner.nextLine();
		  listOFStations.add(station);
	   }
	   Train trainObj=new Train(tno, tName, tSource, tDest, listOFStations);
	   System.out.println(service.addTrain(trainObj));
	 /* if( service.addTrain(trainObj))
	  {
		  System.out.println("Train added with Map");
	  }
	  else
	  {
		  System.out.println("Problem while adding");
	  }*/
	   
   }
//accessing viewTrain method with the object TrainService
  Map<Integer, Train> listOfTrains=  service.viewTrain();
		
  for(Map.Entry<Integer, Train> me:listOfTrains.entrySet())
	{
	int tNumber	=me.getKey();
	Train t=me.getValue();
System.out.println(tNumber + " "+t.getTrainName() + " "+t.getSource() + " "+t.getDestination() + " "+t.getStations());
}	
		
		
		
		

	}

}
