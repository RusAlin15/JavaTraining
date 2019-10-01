package model;

public interface Database {

	void addUserName(String userName);

	void changeUserName(String userName);

	String getUserName();

	void removeUser();

}
