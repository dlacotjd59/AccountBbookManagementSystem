package Accounts;

import java.util.Scanner;

public class PocketMoney extends Account implements AccountInput {
	
	public PocketMoney(MoneyKind pocketmoney) {
		super();
	}

	public void getUserInput(Scanner input) {
		System.out.print("money:");
		int money = input.nextInt();
		this.setMoney(money);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have a name? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("name:");
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
	}
	public void printInfo() {
		System.out.println("money : " + money + "   " + "name : " + name);
	}
}
