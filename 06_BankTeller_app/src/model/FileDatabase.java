package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import app.ApplicationSession;

public class FileDatabase implements Database, Serializable {
	private static final long serialVersionUID = 1L;

	private List<User> users = new ArrayList<>();

	@Override
	public void addUser(User user) {
		users.add(user);
		System.out.println(user);
		ApplicationSession.getInstance().getSerializer().save(this);
	}

	@Override
	public List<User> getClients() {
		return users;
	}

	@Override
	public void removeUserByName(String name) {
		Iterator<User> iterator = users.iterator();

		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getName().equals(name)) {
				iterator.remove();
			}
		}

		ApplicationSession.getInstance().getSerializer().save(this);
	}

}
