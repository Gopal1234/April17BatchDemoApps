package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import dao.FlightServiceImpl;
import model.Flight;
import service.FlightService;

public class FlightMain {

	public static void main(String[] args) throws ParseException {

		FlightService service=new FlightServiceImpl();
		Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number of flights");
	int nof=Integer.parseInt(scanner.nextLine());//3
	for(int i=0; i<nof; i++)
	{
		
		Flight flight=new Flight();
		System.out.println("Enter flight id");
		String fId=scanner.nextLine();
		flight.setFlightId(fId);
		System.out.println("Enter flight type");
		String fType=scanner.nextLine();
		
		flight.setFlightType(fType);
		System.out.println("Enter flight staus");
		boolean fStatus=Boolean.parseBoolean(scanner.nextLine());
		
		flight.setFlightStatus(fStatus);
		System.out.println("Enter flight source");
		String fSource=scanner.nextLine();
		
		flight.setSource(fSource);
		System.out.println("Enter flight destination");
		String fdest=scanner.nextLine();
		flight.setDestination(fdest);
		System.out.println("Enter flight price");
		double price=Double.parseDouble(scanner.nextLine());
		flight.setFlightPrice(price);
		System.out.println("Enter journey date dd/MM/yyyy");
		String fDate=scanner.nextLine();//"04/02/2022"
		/*
		 * Gopal
		 * MM/dd/yyyy
		 * dd-MM-yyyy-hh-mm-ss
		 * dd MMMM yyyy
		 * 08/02/2022
		 * DateFormat
		 * SimpleDateFormat()
		 * SimpleDateFormat("dd/MM/yyyy)
		 * try
		 * {
		 * sdf.parse(fDate)
		 * }
		 * catch(ParseException e)
		 * {
		 * 
		 * }
		 * add throws declarion with caller method
		 * 
		 */
	
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		//parse(String str)---Date --throws ParseException
	Date doj=	   sdf.parse(fDate);
	flight.setFlyingDate(doj);
	
	if( service.addFlight(flight))
	{
		System.out.println("Flight details added sucessfully");
	}
		
	}
	 //getting all details of flight
	List<Flight> listOfFlights =service.viewAllFlights();
	SimpleDateFormat sf=new SimpleDateFormat("dd MMMM yyyy");
for(Flight flight: listOfFlights)
{
	Date d1=flight.getFlyingDate();
	String s1=sf.format(d1);
	
	System.out.println(flight.getFlightId() + " "+flight.getFlightPrice() + " "+s1);
}


System.out.println("******Sorted based on date************");
   List<Flight> sortedFlight=service.sortFlightBasedOnDates();
   for(Flight flight: sortedFlight)
   {
	   Date d1=flight.getFlyingDate();
		String s1=sf.format(d1);
	  System.out.println(flight.getFlightId() + " "+flight.getFlightPrice() + " "+flight.getFlightType() + " "+s1); 
   }
   
   
   System.out.println("******Sorted based on date************");
   List<Flight> sortedFlightBasedOnPrice=service.sortFlightBasedOnPrice();
   for(Flight flight: sortedFlightBasedOnPrice)
   {
	   Date d1=flight.getFlyingDate();
		String s1=sf.format(d1);
	  System.out.println(flight.getFlightId() + " "+flight.getFlightPrice() + " "+flight.getFlightType() + " "+s1); 
   }

	}

}
