package dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import model.Player;
import service.PlayerService;

public class PlayerImpl  implements PlayerService {

	//no order
	//Set<Player> setOfPlayer=new HashSet();
	//insertion order
	//Set<Player> setOfPlayer=new LinkedHashSet();
	//asc order
	Set<Player> setOfPlayer=new TreeSet();
	@Override
	public boolean addPlayer(Player player) {

if(setOfPlayer.add(player))
{
	return true;
}
		return false;
	}

	@Override
	public Set<Player> viewPlayer() {
		// TODO Auto-generated method stub
		return setOfPlayer;
	}

	@Override
	public Player removePlayer(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player updatePlayerSkill(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player serachPlayer(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Player> sortPlayerById() {

		
		/*List<Player> listOfPlayer=new ArrayList(setOfPlayer);
  Collections.sort(listOfPlayer);
  Set<Player> sortedPlayer=new LinkedHashSet<Player>(listOfPlayer);*/
		Set<Player> sortedPlayer=new TreeSet(setOfPlayer);
  
  
		return sortedPlayer;
	}

}
