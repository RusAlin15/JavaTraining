package com.project.game.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.project.game.app.ApplicationSession;

public class FileDatabase implements Database, Serializable {
	private static final long serialVersionUID = 1L;
	private List<Player> players = new ArrayList<>();

	@Override
	public void addPlayer(Player player) {
		players.add(player);
		ApplicationSession.getInstance().getSerializer().save(this);
	}

	@Override
	public List<Player> getPlayers() {
		return players;
	}

	@Override
	public void removePlayer(Player player) {
		players.remove(player);
		ApplicationSession.getInstance().getSerializer().save(this);
	}

	@Override
	public boolean existPlayerByName(String name) {
		Player player = getPlayerByName(name);
		return player != null;
	}

	@Override
	public Player getPlayerByName(String name) {

		Iterator<Player> iterator = players.iterator();
		while (iterator.hasNext()) {
			Player p = iterator.next();
			if (p.getName().toLowerCase().contentEquals(name.toLowerCase())) {
				return p;
			}
		}
		return null;
	}

	@Override
	public void addUnit(Player selectedPlayer, Unit unit) {
		Army army = selectedPlayer.getArmyByType(unit.getType());

		if (army == null) {
			this.addArmy(selectedPlayer, unit.getType());
			army = selectedPlayer.getArmyByType(unit.getType());
		}

		army.addUint(unit);

		ApplicationSession.getInstance().getSerializer().save(this);
	}

	@Override
	public void addArmy(Player selPlayer, UnitType unitType) {
		selPlayer.addArmy(unitType);
		ApplicationSession.getInstance().getSerializer().save(this);
	}

	@Override
	public void resetUnits(Player selectedPlayer) {
		selectedPlayer.resetunits();
		ApplicationSession.getInstance().getSerializer().save(this);
	}

	@Override
	public String toString() {
		String str = System.lineSeparator();
		for (Player player : players) {
			str += player.toString();
		}
		return str;
	}

	@Override
	public void fight(Player selectedPlayer, Player attackedPlayer) {
		// TODO Auto-generated method stub

	}

}
