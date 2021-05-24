package Accounts;

import java.util.Scanner;

import exception.NameFormatException;

public interface AccountInput {
	
	public int getMoney();
	public String getName();
	public int setMoney();
	public String setName();
	public void printInfo();
	public void getUserInput(Scanner input);
	public void setMoney(int money);
	public void setName(String name) throws NameFormatException ;
	public void setMoney(Scanner input);
	public void setName(Scanner input);
	String setNamewithYN();
}