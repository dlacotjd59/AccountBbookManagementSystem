package Accounts;

import java.util.Scanner;

public class ReturnOnInvestment extends Account implements AccountInput {
	
	public ReturnOnInvestment(MoneyKind kind) {
		super();
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("money:");
		int money = input.nextInt();
		this.setMoney(money);
		
		System.out.print("name:");
		String name = input.next();
		this.setName(name);
	}
	public void printInfo() {
		System.out.println("money : " + money + "   " + "name : " + name);
	}
}
