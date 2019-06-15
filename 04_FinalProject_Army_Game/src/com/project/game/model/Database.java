package com.project.game.model;

import java.util.List;

public abstract interface Database {
	
	void addPlayer(Player player);
	List<Player> getPlayers();
	void removePlayerByName(String playerName);

}
