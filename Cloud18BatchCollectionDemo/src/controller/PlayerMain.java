package controller;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import dao.PlayerImpl;
import model.Player;
import service.PlayerService;

public class PlayerMain {
	public static void main(String[] args)
	{
		PlayerService service=new PlayerImpl();
		Scanner scanner=new Scanner(System.in); 
	System.out.println("Enter the number of player");
	int nofPlayer=Integer.parseInt(scanner.nextLine());
	for(int i=0; i<nofPlayer; i++)
	{
		System.out.println("Enter player id");
		int id=Integer.parseInt(scanner.nextLine());;
		System.out.println("enter player skill");
		String skill=scanner.nextLine();
		System.out.println("enter player name");
		String name=scanner.nextLine();
		Player player=new Player(id, skill, name);
		service.addPlayer(player);
		
		
		
	}
		
	//get all player
Set<Player> players=	service.viewPlayer();
	Iterator<Player> itr=players.iterator();
	while(itr.hasNext())
	{
		Player player=itr.next();
		System.out.println(player.getPlayerId() + " "+player.getPlayerSkill() + " "+player.getPlayerName());
		
		
	}
		
		
	Set<Player> sortedPlayer=service.sortPlayerById();
	for(Player p: sortedPlayer)
	{
		System.out.println(p.getPlayerId() +  " "+p.getPlayerName() + " "+p.getPlayerSkill());
	}
		
	}

}
