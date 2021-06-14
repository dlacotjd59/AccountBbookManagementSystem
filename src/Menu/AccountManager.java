package Menu;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Accounts.Account;
import Accounts.AccountInput;
import Accounts.MoneyKind;
import Accounts.PocketMoney;
import Accounts.ReturnOnInvestment;


public class AccountManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4266458253947497905L;
	
	ArrayList<AccountInput> accounts = new ArrayList<AccountInput>();
	Account account;
	transient Scanner input;
	AccountManager(Scanner input) {
		this.input = input;
	}
	
	public void setScanner(Scanner input) {
		this.input = input;
	}
	
	public void Income(String name, int money) {
		AccountInput accountInput = new ReturnOnInvestment(MoneyKind.ReturnOnInvestment);
		accountInput.getUserInput(input);
		accounts.add(accountInput);
	}
	
	public void Income(AccountInput accountInput) {
		accounts.add(accountInput);
	}
	
	public void Income() {
		int kind = 0;
		AccountInput accountInput;
		while (kind < 1 || kind > 2) {
			try {
				System.out.println("(1) for Prat time Job: ");
				System.out.println("(2) for Pocket Money: ");
				System.out.println("Select num for Money Kind between (1) and (2)");
				kind = input.nextInt();
				if (kind == 1) {
					accountInput = new ReturnOnInvestment(MoneyKind.ReturnOnInvestment);
					accountInput.getUserInput(input);
					accounts.add(accountInput);
					break;
				}
				else if (kind == 2) {
					accountInput = new PocketMoney(MoneyKind.PocketMoney);
					accountInput.getUserInput(input);
					accounts.add(accountInput);
					break;
				}
				else {
					System.out.print("Select num for Money Kind between 1 and 2");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 2!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	public void Expense() {
		System.out.print("money:");
		int money = input.nextInt();
		int index = findIndex(money);
		removefromAccounts(index, money);
	}	
	
	public int findIndex(int money) {
		int index = -1;
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getMoney() == money) {
				index = i;
				break;
			}	
		}
		return index;
	}

	public int removefromAccounts(int index, int money) {
		if (index >=0) {
			accounts.remove(index);
			System.out.println("The " + money + " money is expend");
			return 1;
		}
		else {
			System.out.println("The money was not expend");
			return -1;
		}
	}
	public void editAccount() {
		System.out.print("name :");
		String name = input.next();
		for (int i = 0; i < accounts.size(); i++) {
			AccountInput account = accounts.get(i);
			if (account.getName().equals(name)) {
				int num = -1;
				while (num != 1) {
					showEditMenu();
					num = input.nextInt();
					if (num == 1) {
						account.setMoney(input);
					}
					else if (num == 2) {
						account.setName(input);
					}
					else {
						continue;
					}
				}break;
			} 
		}
	}

	public void viewAccounts() {
		System.out.println("#of a registered moneys:" + accounts.size());
		for (int i = 0; i < accounts.size(); i++) {
			accounts.get(i).printInfo();
		}
	}
	
	public int size() {
		return accounts.size();
	}
	
	public AccountInput get(int index) {
		return (Account) accounts.get(index);
	}
	
	public void showEditMenu() {
		System.out.println("** Account Info Edit Menu**");
		System.out.println(" 1. Edit Money");
		System.out.println(" 2. Edit Name");
		System.out.println(" 3. Exit");
		System.out.println("Select one number between 1 - 4:");
			}
}