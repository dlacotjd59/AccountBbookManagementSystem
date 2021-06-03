package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Listener.AccountAdderCancelListener;
import Listener.AccountAdderListener;
import Menu.AccountManager;

public class AccountAdder extends JPanel {
	
	WindowFrame frame;
	AccountManager accountManager;
	
	public AccountAdder(WindowFrame frame, AccountManager accountManager) {
		this.frame = frame;
		this.accountManager = accountManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
	
		JLabel labelNAME = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldNAME = new JTextField(10);
		labelNAME.setLabelFor(fieldNAME);
		
		JLabel labelMONEY = new JLabel("Money : ", JLabel.TRAILING);
		JTextField fieldMONEY = new JTextField(10);
		labelMONEY.setLabelFor(fieldMONEY);
		
		panel.add(labelNAME);
		panel.add(fieldNAME);
		panel.add(labelMONEY);
		panel.add(fieldMONEY);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new AccountAdderListener(fieldNAME, fieldMONEY, accountManager));
		
		JButton cancelButton = new JButton("cancel"); 
		cancelButton.addActionListener(new AccountAdderCancelListener(frame));
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 3, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
		

	}
}