import java.util.Scanner;

public class AccountManager {
	Account account;
	Scanner input;
	AccountManager(Scanner input) {
		this.input = input;
	}
	public void Income() {
		account = new Account();
		System.out.print("money:");
		account.money = input.nextInt();	
		System.out.print("name:");
		account.name = input.next();
	}
	public void Expense() {
		System.out.print("money:");
		int money = input.nextInt();
		if (account == null) {
			System.out.println("The money was not expend");
			return;
		}
		if (account.money == money) {
			System.out.println("The " + account.name + " money is expend");
			account = null;
		}
	}		
	public void editAccount() {
		System.out.print("name :");
		String name = input.next();
		if (account.name.equals(name)) {
			System.out.println("The money to be edited is " + name);
		}
	}
	public void viewAccount() {
		System.out.print("name :");
		String name = input.next();
		if (account.name.equals(name)) {
			account.printInfo();
		}
	}
}

