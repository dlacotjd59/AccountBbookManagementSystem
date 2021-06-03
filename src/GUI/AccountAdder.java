package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AccountAdder extends JPanel {
	
	WindowFrame frame;

	public AccountAdder(WindowFrame frame) {
		this.frame = frame;
		
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
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 3, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
		

	}
}