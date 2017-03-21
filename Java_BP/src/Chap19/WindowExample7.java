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
 * 작성일자:2017_03_21
 * 작성자:길경완
 * 테이블이 있는 윈도우 프로그램
 * 예제 19-7
 * 예제 19-8: 테이블이 있는 윈도우 프로그램(완성)
 */
public class WindowExample7 {
	public static void main(String[] args){
		JFrame frame = new JFrame("참자가 명단 프로그램.");
		frame.setLocation(500,400);
		frame.setPreferredSize(new Dimension(200, 70));
		Container contentPane = frame.getContentPane();
		String colName[] = {"이름","나이","성별"};
		Object data[][] = {{"김철수",24,'남'},{"이순희",21,'여'},{"박지영",26,'여'}};
		JTable table = new JTable(data,colName);
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		JButton button = new JButton("출력");
		button.addActionListener(new PrintActionListner(table));
		contentPane.add(button, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
