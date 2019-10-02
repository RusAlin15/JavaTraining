package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private List<Account> accounts = new ArrayList<>();
	private int totalAccounts = 0;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addAcount(Account account) {
		accounts.add(account);
	}

	@Override
	public String toString() {
		return accounts + "";
	}

}
