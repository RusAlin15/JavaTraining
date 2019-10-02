package model;

public interface Database {

	void addUserName(String userName);

	void changeUserName(String userName);

	String getUserName();

	void removeUser();

	void addAccount(Account account);

	void showAccounts();

}
