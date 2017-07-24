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
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 * �ۼ�����:2017_03_21
 * �ۼ���:����
 * JPanel�� ��� ���� �����ִ� ���α׷�
 * ���� 19-6
 */
public class WindowExample6 {
	public static void main(String[] args){
		JFrame frame = new JFrame("Hello java Program.");
		frame.setLocation(500,400);
		frame.setPreferredSize(new Dimension(200, 70));
		Container contentPane = frame.getContentPane();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();
		panel.add(new JLabel("�̸�"));
		panel.add(text1);
		panel.add(new JLabel("�ּ�"));
		panel.add(text2);
		panel.add(new JLabel("��ȭ��ȣ"));
		panel.add(text3);
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(new JButton("�Է�"),BorderLayout.SOUTH);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}