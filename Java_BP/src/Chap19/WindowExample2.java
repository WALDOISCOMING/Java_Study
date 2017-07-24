package Chap19;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 * �ۼ�����:2017_03_21
 * �ۼ���:����
 * �ؽ�Ʈ ���ڿ� ��ư�� �ִ� hello ���α׷�(�̿ϼ�)
 * ���� 19-3
 * ���� 19-4: �ؽ�Ʈ ���ڿ� ��ư�� �ִ� hello ���α׷�(�ϼ�)
 */
public class WindowExample2 {
	public static void main(String[] args){
		JFrame frame = new JFrame("Hello java Program.");
		frame.setLocation(500,400);
		frame.setPreferredSize(new Dimension(200, 70));
		Container contentPane = frame.getContentPane();
		JTextField text = new JTextField();
		JButton button = new JButton("Ȯ��");
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
