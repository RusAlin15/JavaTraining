package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import app.ApplicationSession;

public class FileDatabase implements Database, Serializable {
	private static final long serialVersionUID = 1L;

	private List<Bank> banks = new ArrayList<>();

	@Override
	public void addBank(Bank bank) {
		banks.add(bank);
		System.out.println(bank);
		ApplicationSession.getInstance().getSerializer().save(this);
	}

	@Override
	public List<Bank> getClients() {
		return banks;
	}

	@Override
	public void removeBankByName(String name) {
		Iterator<Bank> iterator = banks.iterator();

		while (iterator.hasNext()) {
			Bank s = iterator.next();
			if (s.getName().equals(name)) {
				iterator.remove();
			}
		}

		ApplicationSession.getInstance().getSerializer().save(this);
	}

}
