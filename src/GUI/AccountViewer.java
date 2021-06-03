package GUI;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Accounts.AccountInput;
import Menu.AccountManager;

public class AccountViewer extends JPanel {
	
	WindowFrame frame;
	
	AccountManager accountManager;

	public AccountViewer(WindowFrame frame,AccountManager accountManager) {
		this.frame = frame;
		this.accountManager = accountManager;
		
		System.out.println("***" + accountManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Money");
		
		for (int i=0; i<accountManager.size(); i++) {
			Vector row = new Vector();
			AccountInput si = accountManager.get(i);
			row.add(si.getMoney());
			row.add(si.getName());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}