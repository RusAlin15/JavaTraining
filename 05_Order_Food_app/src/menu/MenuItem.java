package menu;

public abstract class MenuItem {
	private String key;
	private String option;

	public abstract void doAction();

	public MenuItem(String key, String option) {
		super();
		this.key = key;
		this.option = option;
	}

	@Override
	public String toString() {
		return key + ". " + option;
	}

	public Object getKey() {
		return key;
	}

}
