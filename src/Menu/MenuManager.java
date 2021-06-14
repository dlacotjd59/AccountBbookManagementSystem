package Menu;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import GUI.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AccountManager accountManager = getObject("accountmanager.ser");
		if (accountManager == null) {
			 accountManager = new AccountManager(input);
		}
		else {
			accountManager.input = input;
		}
		
		WindowFrame frame = new WindowFrame(accountManager);
		SelectMenu(input, accountManager);		
		putObject(accountManager, "accountmanager.ser");
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
					logger.log("add a account");
					break;
				case 2:
					accountManager.Expense();
					logger.log("delete a account");
					break;
				case 3:
					accountManager.editAccount();
					logger.log("edit a account");
					break;
				case 4:
					accountManager.viewAccounts();
					logger.log("view a list of account");
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
	
	public static AccountManager getObject(String filename) {
		AccountManager accountManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			accountManager = (AccountManager)in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return accountManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accountManager;
	}
	public static void putObject(AccountManager accountManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(accountManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}
}