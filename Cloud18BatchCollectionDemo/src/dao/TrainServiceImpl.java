package dao;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import model.Train;
import service.TrainService;

public class TrainServiceImpl  implements TrainService{
//train number ; ---> Train object{tarinname, source, destination , halts}
	//Map<Integer, Train> listOfTrain=new TreeMap<Integer, Train>();
	Map<Integer, Train> listOfTrain=new LinkedHashMap<Integer, Train>();
	@Override
	public boolean addTrain(Train train) {
		/*
		 * 
		 * 
		 * put() returns null if new set of key and value object we will pass in map
		 * return the existing object for value which associated with given key once we will pass same set of existing key and value object
		 */
		int tno=train.getTrainNumber();
		System.out.println(tno);
		System.out.println(train);
	Train t=listOfTrain.put(tno, train);
	System.out.println(t);
   if( t !=null)
   {
	   return true;
   }else
   {
		
		
		return false;
   }
	}

	@Override
	public Map<Integer, Train> viewTrain() {
		
		return listOfTrain;
	}

	@Override
	public Train searchTrain(int trainNumber) {

	/*Set<Integer> setOfKeys=	listOfTrain.keySet();
 Iterator<Integer> itr=  setOfKeys.iterator();
	while(itr.hasNext())
	{
	int tNumber=	itr.next();
	if(tNumber==trainNumber)
	{
		Train train=listOfTrain.get(tNumber);
		return train;
	}
	}*/
		/*
		 * Map<interface>
		 * |
		 * Entry<interface>
		 * 
		 * iterface Map
		 * {
		 * 
		 * interface Entry
		 * {
		 * getKey()--Object
		 * getValue()---Object
		 * }
		 * }
		 * 
		 * 
		 */
		
		
	//	<Entry1{mapObje1{int, tarinobj1}>
	Set<Entry<Integer, Train>> setOfEntries=	listOfTrain.entrySet();
		
		for(Map.Entry<Integer, Train> me:setOfEntries)
		{
		int tNumber	=me.getKey();
	if(tNumber==trainNumber)
	{
Train train=	me.getValue();
return train;
	}
		}
		return null;
	}

	@Override
	public Train removeTrain(int trainNumber) {

		for(Map.Entry<Integer, Train> me:listOfTrain.entrySet())
		{
		int tNumber	=me.getKey();
	if(tNumber==trainNumber)
	{

Train train=listOfTrain.remove(tNumber);
return train;
	}
		}
		return null;
	}
	

}
