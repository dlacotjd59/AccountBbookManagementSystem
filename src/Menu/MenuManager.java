package Menu;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AccountManager  accountManager = new AccountManager(input);
		
		int num = 1;
		while (num != 5) {
		System.out.println("*** Account Management System Menu ***");
		System.out.println("1. Income");
		System.out.println("2. Expense");
		System.out.println("3. Edit Account");
		System.out.println("4. View Account");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-5:");
		num = input.nextInt();
			if (num == 1) {
				accountManager.Income();
			}
			else if (num == 2) {
				accountManager.Expense();
			}
			else if (num == 3) {
				accountManager.editAccount();
			}
			else if (num == 4) {
				accountManager.viewAccounts();
			}
			else {
				continue;
			}//if
		}//while
	}//if
}//for