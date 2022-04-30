package dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import model.Flight;
import model.SortBasedOnDate;
import model.SortFlightPriceBased;
import service.FlightService;

public class FlightServiceImpl implements FlightService {

	/*
	 * DB server
	 * cloud server
	 * Collection
	 * 
	 * 
	 */
	String name;
	List<Flight> listOfFlights=new LinkedList();
	@Override
	public boolean addFlight(Flight flight) {
//add(Object obj)---boolean
       if(listOfFlights.add(flight))
       {
    	   return true;
       }
		
		return false;
	}

	@Override
	public List<Flight> viewAllFlights() {


		return listOfFlights;
	}

	@Override
	public List<Flight> serachFlight(String source, String destination) {
		
		List<Flight> listOfSearhedFlight=new ArrayList();
		for(int i=0; i<listOfFlights.size(); i++)
		{
			if(listOfFlights.get(i).getSource().equals(source) && listOfFlights.get(i).getDestination().equals(destination))
			{
				listOfSearhedFlight.add(listOfFlights.get(i));
				
			}
			
		}
		
		return listOfSearhedFlight;
	}

	@Override
	public Flight removeFlight(String flightId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> sortFlightBasedOnDates() {
		//Collections.sort(listOfFlights);
		//Incase of comparator we have to pass the list object and the object of class which implements comparator interface
		Collections.sort(listOfFlights, new SortBasedOnDate());
		return listOfFlights;
	}

	@Override
	public List<Flight> sortFlightBasedOnPrice() {
		Collections.sort(listOfFlights, new SortFlightPriceBased());
		return listOfFlights;
	}

}
