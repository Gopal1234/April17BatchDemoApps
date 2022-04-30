package service;

import java.util.Set;

import model.Player;

public interface PlayerService {
	
	
	
	public boolean addPlayer(Player player);
	public Set<Player> viewPlayer();
	public Player removePlayer(int pid);
	public Player updatePlayerSkill(int pid);
	public Player serachPlayer(int pid);
	public Set<Player> sortPlayerById();

}
