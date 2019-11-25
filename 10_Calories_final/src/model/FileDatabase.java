package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import app.ApplicationSession;

public class FileDatabase implements Database, Serializable {
	private static final long serialVersionUID = 1L;

	private List<Food> foodList = new ArrayList<>();

	@Override
	public void addFood(Food food) {
		foodList.add(food);
		ApplicationSession.getInstance().getSerializer().save(this);
	}

	@Override
	public void viewFood() {
		System.out.println(foodList.toString());
	}

}
