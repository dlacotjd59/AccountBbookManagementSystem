package Account;

import java.util.Scanner;

public class Account {
	
	protected MoneyKind kind = MoneyKind.PartTimeJob;
	String name;
	int money;
	public Account() {
	}
	public Account(int money) {
		this.money = money;
	}
	public Account(int money, String name) {
		this.money = money;
		this.name = name;
	}
	
	public MoneyKind getKind() {
		return kind;
	}
	public void setKind(MoneyKind kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void printInfo() {
		System.out.println("money : " + money + "   " + "name : " + name);
	}
	public void getUserInput(Scanner input) {
		System.out.print("money:");
		int money = input.nextInt();
		this.setMoney(money);
		
		System.out.print("name:");
		String name = input.next();
		this.setName(name);
	}
}

