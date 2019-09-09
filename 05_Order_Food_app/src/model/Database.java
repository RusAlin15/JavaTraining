package model;

import exceptions.IdNotExistException;
import exceptions.NullInputException;
import exceptions.UserExistException;
import exceptions.UserNotExistException;

public interface Database {

	void addUser(String name) throws UserExistException, NullInputException;

	void showUsers();

	void deleteUser(String name) throws NullInputException, UserNotExistException;

	void addOption(String description, int price, String deliveryDate);

	void showOptions();

	void deleteOption(String id) throws IdNotExistException, NullInputException;

	User getUserByName(String userName) throws UserNotExistException, NullInputException;

	void addOrder(String userName, String optionsIDs);

	void existsUserByName(String userName) throws NullInputException, UserExistException;

}
