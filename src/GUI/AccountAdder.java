package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AccountAdder extends JFrame {

	public AccountAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelNAME = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldNAME = new JTextField(10);
		labelNAME.setLabelFor(fieldNAME);
		panel.add(labelNAME);
		panel.add(fieldNAME);
		
		JLabel labelMONEY = new JLabel("Money : ", JLabel.TRAILING);
		JTextField fieldMONEY = new JTextField(10);
		labelMONEY.setLabelFor(fieldMONEY);
		panel.add(labelMONEY);
		panel.add(fieldMONEY);
		
		SpringUtilities.makeCompactGrid(panel, 2, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
