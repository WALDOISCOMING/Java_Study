package Chap19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.TableModel;

public class PrintActionListner implements ActionListener{
	JTable table;
	public PrintActionListner(JTable table) {
		this.table = table;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		TableModel model = table.getModel();
		int rowNum = model.getRowCount();
		int colNum = model.getColumnCount();
		for(int col = 0;col<colNum;col++){
			String colName = model.getColumnName(col);
			System.out.print(colName+"\t");
		}
		System.out.println();
		for(int row = 0;row<rowNum;row++){
			for(int col = 0;col<colNum;col++){
				Object obj = model.getValueAt(row, col);
				System.out.print(obj+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}

}
