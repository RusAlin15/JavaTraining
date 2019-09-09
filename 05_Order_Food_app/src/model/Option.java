package model;

import java.io.Serializable;

public class Option implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String description;
	private int price;
	private Date date;

	public Option(String id, String description, int price, Date date) {
		super();
		this.id = id;
		this.description = description;
		this.price = price;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Option: " + id + ", " + description + ", " + price + " lei, delivery date: " + date;
	}

	public Object getId() {
		return id;
	}

}
