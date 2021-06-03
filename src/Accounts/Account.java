package Accounts;

import java.io.Serializable;
import java.util.Scanner;

import exception.NameFormatException;

public abstract class Account implements AccountInput, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1375222917595428084L;
	public MoneyKind kind = MoneyKind.PartTimeJob;
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
	public void setName(String name) throws NameFormatException {
		if (!name.contains("!") && !name.equals("")) {
			throw new NameFormatException();
		}
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public abstract void printInfo();
	public void setMoney(Scanner input) {
		System.out.print("Account Money : ");
		int money = input.nextInt();
		this.setMoney(money);
	}
	
	public void setName(Scanner input) {
		String name = "";
		while (!name.contains("!")) {
		System.out.println("Name : ");
			name = input.next();
			try {
				this.setName(name);
			} 
			catch (NameFormatException e) {
				System.out.println("Incorrect Name Format. put the Name that contains !");
			}
		}
	}
	public Account get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
}