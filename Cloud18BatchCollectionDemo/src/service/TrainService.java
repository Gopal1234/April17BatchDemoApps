package service;

import java.util.Map;

import model.Train;

public interface TrainService {

	//addTrain method will train objects into TreeMap
	boolean addTrain(Train train);
	Map<Integer, Train> viewTrain();
Train	searchTrain(int trainNumber);
Train removeTrain(int trainNumber);
	
	
	
}
