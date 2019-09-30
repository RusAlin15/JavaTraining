package model;

import java.util.List;

public interface Database {

	void addBank(Bank bank);

	List<Bank> getClients();

	void removeBankByName(String name);

}
