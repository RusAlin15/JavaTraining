package com.project.game.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.project.game.app.ApplicationSession;

public class FileDatabase implements Database, Serializable{
	private static final long serialVersionUID = 1L;
	
	private List<Player> players = new ArrayList<>();

	@Override
	public void addPlayer(Player player) {
		players.add(player);
		System.out.println(player);
		ApplicationSession.getInstance().getSerializer().save(this);
	}

	@Override
	public List<Player> getPlayers() {
		return players;
	}

	@Override
	public void removePlayerByName(String playerName) {
		Iterator<Player> iterator = players.iterator();
		
		while (iterator.hasNext()) {
			Player p = iterator.next();
			if (p.getName().contentEquals(playerName)) {
				iterator.remove();
			}
		}
		ApplicationSession.getInstance().getSerializer().save(this);
	}

}