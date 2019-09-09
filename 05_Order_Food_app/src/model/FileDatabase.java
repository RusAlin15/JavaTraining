package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import app.ApplicationSession;
import exceptions.IdNotExistException;
import exceptions.NullInputException;
import exceptions.UserExistException;
import exceptions.UserNotExistException;

public class FileDatabase implements Database, Serializable {
	private static final long serialVersionUID = 1L;
	private List<User> users = new ArrayList<>();
	private List<Option> options = new ArrayList<>();
	private int orderNumber = 0;

	@Override
	public void addUser(String name) throws UserExistException, NullInputException {

		existsUserByName(name);
		users.add(new User(name));
		ApplicationSession.getInstance().getSerializer().save(this);
	}

	public void existsUserByName(String name) throws NullInputException, UserExistException {
		try {
			getUserByName(name);
			throw new UserExistException();
		} catch (UserNotExistException e) {
		}
	}

	@Override
	public void showUsers() {
		for (User user : users) {
			System.out.print(user);
		}
		System.out.println();
	}

	@Override
	public void deleteUser(String name) throws NullInputException, UserNotExistException {
		User user = getUserByName(name);
		users.remove(user);
		ApplicationSession.getInstance().getSerializer().save(this);
	}

	public User getUserByName(String name) throws UserNotExistException, NullInputException {
		if (name == "") {
			throw new NullInputException();
		}
		for (User user : users) {
			if (user.getName().toLowerCase().equals(name.toLowerCase())) {
				return user;
			}
		}
		throw new UserNotExistException();
	}

	@Override
	public void addOption(String description, int price, String deliveryDate) {

		String id = generateId();

		options.add(new Option(id, description, price, new Date(deliveryDate)));
		ApplicationSession.getInstance().getSerializer().save(this);
		return;
	}

	private String generateId() {
		String id = "ID";
		id += ++orderNumber;
		return id;
	}

	private boolean existId(String id) {
		if (getOptionById(id) != null) {
			return true;
		}
		return false;
	}

	@Override
	public void showOptions() {
		System.out.println();
		for (Option option : options) {
			System.out.println(option);
		}
	}

	@Override
	public void deleteOption(String id) throws IdNotExistException, NullInputException {
		if (id == "") {
			throw new NullInputException();
		}

		if (!existId(id)) {
			throw new IdNotExistException();
		}

		Option option = getOptionById(id);
		options.remove(option);
		ApplicationSession.getInstance().getSerializer().save(this);
	}

	private Option getOptionById(String id) {
		for (Option option : options) {
			if (option.getId().equals(id)) {
				return option;
			}
		}
		return null;
	}

	@Override
	public void addOrder(String userName, String optionsIDs) {
		// TODO Auto-generated method stub

	}

}
