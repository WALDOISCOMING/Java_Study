package Chap19;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/*
 * 작성일자:2017_03_21
 * 작성자:길경완
 * 테이블에 행을 추가/삭제하는 윈도우 프로그램
 * 예제 19-9
 */
public class WindowExample8 {
	public static void main(String[] args){
		JFrame frame = new JFrame("참자가 명단 프로그램.");
		frame.setLocation(500,400);
		frame.setPreferredSize(new Dimension(200, 70));
		Container contentPane = frame.getContentPane();
		String colName[] = {"이름","나이","성별"};
		DefaultTableModel model = new DefaultTableModel(colName, 0);
		
		JTable table = new JTable(model);
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
		JPanel panel = new JPanel();
		JTextField text1 = new JTextField(6);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(2);
		
		
		JButton button1 = new JButton("추가");
		JButton button2 = new JButton("삭제");
		panel.add(new JLabel("이름"));
		panel.add(text1);
		panel.add(new JLabel("나이"));
		panel.add(text2);
		panel.add(new JLabel("성별"));
		panel.add(text3);
		panel.add(button1);
		panel.add(button2);
		contentPane.add(panel, BorderLayout.SOUTH);
		button1.addActionListener(new AddActionListner(table, text1, text2, text3));
		button2.addActionListener(new RemoveActionListener(table));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
