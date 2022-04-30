package model;

public class Player implements Comparable<Player> {
private int playerId;
private String playerSkill;
private String playerName;
public Player(int playerId, String playerSkill, String playerName) {
	super();
	this.playerId = playerId;
	this.playerSkill = playerSkill;
	this.playerName = playerName;
}
public int getPlayerId() {
	return playerId;
}
public void setPlayerId(int playerId) {
	this.playerId = playerId;
}
public String getPlayerSkill() {
	return playerSkill;
}
public void setPlayerSkill(String playerSkill) {
	this.playerSkill = playerSkill;
}
public String getPlayerName() {
	return playerName;
}
public void setPlayerName(String playerName) {
	this.playerName = playerName;
}
@Override
public int compareTo(Player p) {

if(p.playerId <this.playerId)
{
	return 1;
}
	
	
	return -1;
}





	
	
	
}
