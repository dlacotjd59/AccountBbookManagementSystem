package Accounts;

import java.util.Scanner;

public class ReturnOnInvestment extends Account  {
	
	public ReturnOnInvestment(MoneyKind kind) {
		super();
	}
	
	public void getUserInput(Scanner input) {
		setMoney(input);
		setName(input);
	}
	public void printInfo() {
		System.out.println("money : " + money + "   " + "name : " + name);
	}

	@Override
	public int setMoney() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String setName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setNamewithYN() {
		// TODO Auto-generated method stub
		return null;
	}
}