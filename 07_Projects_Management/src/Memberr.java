
public class Memberr {
	private String Name;
	private int age;

	public Memberr(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name=" + Name + ", age=" + age + "]";
	}
}
