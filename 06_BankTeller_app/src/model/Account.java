package model;

public class Account implements TotalSum {

	private String accountNumber;
	private float amount;

	public Account(String accountNumber, float amount) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Account " + accountNumber + ", amount= " + amount;
	}

	@Override
	public float getTotalSum() {
		// TODO Auto-generated method stub
		return 0;
	}
}
