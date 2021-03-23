import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		while (num != 6) {
		System.out.println("1. Income");
		System.out.println("2. Expense");
		System.out.println("3. Edit Account");
		System.out.println("4. View Account");
		System.out.println("5. Show a Menu");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1-6:");
		num = input.nextInt();
		
		}
	}
}