package model;

import java.io.Serializable;

import app.ApplicationSession;

public class FileDatabase implements Database, Serializable {
	private static final long serialVersionUID = 1L;

	private User user;

	@Override
	public void addUserName(String userName) {
		user = new User(userName);
		ApplicationSession.getInstance().getSerializer().save(this);
	}

	@Override
	public String getUserName() {
		return user.getName();
	}

	@Override
	public void removeUser() {

		ApplicationSession.getInstance().getSerializer().save(this);
	}

	@Override
	public void changeUserName(String userName) {

	}

	@Override
	public void addAccount(Account account) {
		user.addAcount(account);
		ApplicationSession.getInstance().getSerializer().save(this);
	}

	@Override
	public void showAccounts() {
		System.out.println(user.toString());
	}

}
