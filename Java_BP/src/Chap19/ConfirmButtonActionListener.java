package Chap19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConfirmButtonActionListener implements ActionListener{
	JTextField text;
	JLabel label;
	public ConfirmButtonActionListener(JTextField text,	JLabel label) {
		this.text=text;this.label=label;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = text.getText();
		label.setText("Hello"+name);
	}

}
