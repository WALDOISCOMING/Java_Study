package Chap19;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 * 작성일자:2017_03_21
 * 작성자:길경완
 * 여러 레이 아웃 사용하는 프로그램들
 * 예제 19-5
 */
public class WindowExample3 {
	public static void main(String[] args){
		JFrame frame = new JFrame("Hello java Program.");
		frame.setLocation(500,400);
		frame.setPreferredSize(new Dimension(200, 70));
		Container contentPane = frame.getContentPane();
		GridLayout layout = new GridLayout(3, 2);
		contentPane.setLayout(layout);
		JTextField text = new JTextField();
		JButton button = new JButton("확인");
		JLabel label = new JLabel("Hello, java!",SwingConstants.CENTER);
		contentPane.add(label,BorderLayout.SOUTH);
		contentPane.add(text,BorderLayout.CENTER);
		contentPane.add(button,BorderLayout.EAST);
		ActionListener listener = new ConfirmButtonActionListener(text, label);
		button.addActionListener(listener);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
