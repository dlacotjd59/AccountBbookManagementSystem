package Menu;
import java.util.ArrayList;
import java.util.Scanner;

import Accounts.Account;
import Accounts.AccountInput;
import Accounts.MoneyKind;
import Accounts.PocketMoney;
import Accounts.ReturnOnInvestment;


public class AccountManager {
	ArrayList<AccountInput> accounts = new ArrayList<AccountInput>();
	Account account;
	Scanner input;
	AccountManager(Scanner input) {
		this.input = input;
	}
	
	public void Income() {
		int kind = 0;
		AccountInput accountInput;
		while (kind != 1 && kind != 2) {
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
	}
	public void Expense() {
		System.out.print("money:");
		int money = input.nextInt();
		int index = -1;
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getMoney() == money) {
				index = i;
				break;
			}	
		}
		if (index >=0) {
			accounts.remove(index);
			System.out.println("The " + money + " money is expend");
		}
		else {
			System.out.println("The money was not expend");
			return;
		}
	}	
	public void editAccount() {
		System.out.print("name :");
		String name = input.next();
		for (int i = 0; i < accounts.size();) {
			AccountInput accountInput = accounts.get(i);
			if (accountInput.getName().equals(name)) {
				System.out.println("The money to be edited is " + name);
			}//if¹®
			break;
		}//for¹®
	}
	public void viewAccounts() {
//		System.out.print("name :");
//		String name = input.next();
		System.out.println("#of a registered moneys:" + accounts.size());
		for (int i = 0; i < accounts.size(); i++) {
			accounts.get(i).printInfo();
		}
	}
}