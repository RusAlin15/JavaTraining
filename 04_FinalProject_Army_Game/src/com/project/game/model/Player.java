package com.project.game.model;

import java.io.Serializable;

public class Player implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	public Player(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}

	public String getName() {
		return name;
	}
	

}
