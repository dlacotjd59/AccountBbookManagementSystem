package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Accounts.Account;
import Accounts.AccountInput;
import Accounts.MoneyKind;
import Accounts.ReturnOnInvestment;
import Menu.AccountManager;
import exception.NameFormatException;

public class AccountAdderListener implements ActionListener {
	JTextField fieldNAME;
	JTextField fieldMONEY;
	AccountManager accountManager;
	
	public AccountAdderListener(JTextField fieldNAME, JTextField fieldMONEY, AccountManager accountManager) {
		this.fieldNAME = fieldNAME;
		this.fieldMONEY = fieldMONEY;
		this.accountManager = accountManager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {	
		AccountInput account = new ReturnOnInvestment(MoneyKind.ReturnOnInvestment);
		try {
			account.setName(fieldNAME.getText());
			account.setMoney(Integer.parseInt(fieldMONEY.getText()));
			accountManager.Income(account);
			putObject(accountManager, "accountmanager.ser");
			account.printInfo();
		} catch (NameFormatException e1) {
			e1.printStackTrace();
		}
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
