package model;

import java.util.List;

public class Train implements Comparable<Train> {
	private int trainNumber;
	private String trainName;
	private String source;
	private String destination;
	private List<String> stations;
	
	
	
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Train(int trainNumber, String trainName, String source, String destination, List<String> stations) {
		super();
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.stations = stations;
	}
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public List<String> getStations() {
		return stations;
	}
	public void setStations(List<String> stations) {
		this.stations = stations;
	}
	@Override
	public int compareTo(Train t) {
		if(t.getTrainNumber() <this.getTrainNumber())
		{
			return 1;
		}
		
		return -1;
	}
	
	
	
	
	
	

}
