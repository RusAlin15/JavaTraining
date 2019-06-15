package com.project.game.model;

import java.util.List;

public abstract interface Database {
	
	abstract void addPlayer(Player player);
	abstract List<Player> getPlayers();
	abstract void removePlayer(String playerName);

}
