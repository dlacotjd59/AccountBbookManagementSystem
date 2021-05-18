package Menu;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AccountManager  accountManager = new AccountManager(input);
		SelectMenu(input, accountManager);		

	}
	
	public static void SelectMenu(Scanner input, AccountManager  accountManager) {
		int num = 1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					accountManager.Income();
					break;
				case 2:
					accountManager.Expense();
					break;
				case 3:
					accountManager.editAccount();
					break;
				case 4:
					accountManager.viewAccounts();
					break;
				default: 
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}	
		}
	}
	
	public static void showMenu() {
		System.out.println("*** Account Management System Menu ***");
		System.out.println("1. Income");
		System.out.println("2. Expense");
		System.out.println("3. Edit Account");
		System.out.println("4. View Account");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-5:");
	}
}