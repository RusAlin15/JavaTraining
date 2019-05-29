package sessions.session01;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	private boolean glasses;

	public Person(String name, int age, boolean glasses) {
		super();
		this.name = name;
		this.age = age;
		this.glasses = glasses;
	}
		
	@Override
	public String toString() {
		return name + "," + age  + "," + glasses;
	}
	  

}
