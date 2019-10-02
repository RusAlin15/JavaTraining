package model;

import java.io.Serializable;

public class Account implements Serializable, TotalSum {

	private static final long serialVersionUID = 1L;
	private String accountName;
	private float amount;
	private Bank bank;

	public Account(String accountNumber, Bank bank, float amount) {
		super();
		this.accountName = accountNumber;
		this.amount = amount;
		this.bank = bank;

	}

	@Override
	public String toString() {
		return System.lineSeparator() + bank + " : " + "Account name: " + accountName + " : " + amount
				+ System.lineSeparator();
	}

	@Override
	public float getTotalSum() {
		// TODO Auto-generated method stub
		return 0;
	}
}
