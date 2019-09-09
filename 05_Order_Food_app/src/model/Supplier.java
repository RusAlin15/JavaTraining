package com.savnet.utils.demo.model;

import java.io.Serializable;

public class Supplier implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private String city;

	public Supplier(String name, String city) {
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Supplier [name=" + name + ", city=" + city + "]";
	}

	public String getName() {
		return name;
	}

}
