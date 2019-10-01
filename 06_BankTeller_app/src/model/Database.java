package model;

import java.util.List;

public interface Database {

	void addUser(User user);

	List<User> getClients();

	void removeUserByName(String name);

}
