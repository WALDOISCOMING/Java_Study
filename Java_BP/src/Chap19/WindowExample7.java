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

/*
 * �ۼ�����:2017_03_21
 * �ۼ���:����
 * ���̺��� �ִ� ������ ���α׷�
 * ���� 19-7
 * ���� 19-8: ���̺��� �ִ� ������ ���α׷�(�ϼ�)
 */
public class WindowExample7 {
	public static void main(String[] args){
		JFrame frame = new JFrame("���ڰ� ��� ���α׷�.");
		frame.setLocation(500,400);
		frame.setPreferredSize(new Dimension(200, 70));
		Container contentPane = frame.getContentPane();
		String colName[] = {"�̸�","����","����"};
		Object data[][] = {{"��ö��",24,'��'},{"�̼���",21,'��'},{"������",26,'��'}};
		JTable table = new JTable(data,colName);
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		JButton button = new JButton("���");
		button.addActionListener(new PrintActionListner(table));
		contentPane.add(button, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
