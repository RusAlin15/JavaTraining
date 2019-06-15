package com.project.game.model;

import java.util.List;

public abstract interface Database {
	
	void addPlayer(Player player);
	List<Player> getPlayers();
	Player getPlayerByName(String name);
	void removePlayer(Player player);
	boolean existPlayerByName(String name);
	

}
