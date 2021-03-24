import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;
		
		while (num != 6) {
		System.out.println("*** Account Management System Menu ***");
		System.out.println("1. Income");
		System.out.println("2. Expense");
		System.out.println("3. Edit Account");
		System.out.println("4. View Account");
		System.out.println("5. Show a Menu");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1-6:");
		num = input.nextInt();
		if (num == 1) {
				Income();
		}
		else if (num == 2) {
				Expense();
		}
		else if (num == 3) {
			editAccount();
		}
		else if (num == 4) {
			viewAccount();
		}
		else {
			continue;
		}
		}
	}
	
	public static void Income() {
		Scanner input = new Scanner(System.in);
		System.out.print("income:");
		int Income = input.nextInt();	
		System.out.print("income Name:");
		String IncomeName = input.next();
	}
	public static void Expense() {
		Scanner input = new Scanner(System.in);
		System.out.print("expense:");
		int expense = input.nextInt();
		System.out.print("expense Name:");
		String ExpenseName = input.next();
	}
		
	public static void editAccount() {
		Scanner input = new Scanner(System.in);	
		System.out.print("income Name or expense Name:");
		String IncomeName = input.next();
	}
	public static void viewAccount() {
		Scanner input = new Scanner(System.in);	
		System.out.print("income Name or expense Name:");
		String IncomeName = input.next();
	}
}