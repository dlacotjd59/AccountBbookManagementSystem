package Listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import GUI.AccountViewer;
import GUI.WindowFrame;
import Menu.AccountManager;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		AccountViewer accountViewer = frame.getAccountviewer();
		AccountManager accountManager = getObject("accountmanager.ser");
		accountViewer.setAccountManager(accountManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(accountViewer);
		frame.revalidate();
		frame.repaint();
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
}