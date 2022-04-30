package service;

import java.util.List;

import model.Flight;

public interface FlightService {
	public boolean addFlight(Flight flight);
	public List<Flight> viewAllFlights();
	public List<Flight> serachFlight(String source, String destination);
	public Flight removeFlight(String flightId);
	public List<Flight> sortFlightBasedOnDates();
	public List<Flight> sortFlightBasedOnPrice();
	

}
