package Accounts;

import java.util.Scanner;

import exception.NameFormatException;

public class PocketMoney extends Account {
	
	public PocketMoney(MoneyKind pocketmoney) {
		super();
	}
	
	public void getUserInput(Scanner input) {
		setMoney(input);
		setNamewithYN(input);
	}

	public void setNamewithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have a name? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					System.out.println("Name : ");
					String name = input.next();
					this.setName(name);
					break;
				}
				else if (answer == 'n' && answer == 'N') {
					this.setName("");
					break;
				}
				else {
				}
			}
			catch(NameFormatException e) {
				System.out.println("Incorrect Name Format. put the Name that contains !");
				}
			}
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