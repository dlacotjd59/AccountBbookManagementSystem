package Accounts;

import java.util.Scanner;

public interface AccountInput {
	
	public int getMoney();
	public String getName();
	public void printInfo();
	
	public void getUserInput(Scanner input);
	
}
