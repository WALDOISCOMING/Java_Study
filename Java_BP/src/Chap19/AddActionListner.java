package Chap19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddActionListner implements ActionListener{
	JTable table;
	JTextField text1,text2,text3;
	public AddActionListner(JTable table,JTextField text1,JTextField text2,JTextField text3) {
		this.table=table;this.text1=text1;this.text2=text2;this.text3=text3;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String arr[] = new String[3];
		arr[0] = text1.getText();
		arr[1] = text2.getText();
		arr[2] = text3.getText();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addRow(arr);
	}

}
