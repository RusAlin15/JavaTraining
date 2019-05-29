package sessions.session01.files;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 2L;

	private String name;
	private int age;
	private boolean glasses;
	private int salary;

	public Person(String name, int age, boolean glasses) {
		super();
		this.name = name;
		this.age = age;
		this.glasses = glasses;
	}

	public Person(String text) {
		String[] splits = text.split(",");
		name = splits[0];
		age = Integer.parseInt(splits[1]);
		glasses = Boolean.parseBoolean(splits[2]);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", glasses=" + glasses + salary + "]";
	}

	public String toFileFormat() {
		return name + "," + age + "," + glasses;
	}

}
