package Chap19;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/*
 * �ۼ�����:2017_03_20
 * �ۼ���:����
 * ������� �۵��ϴ� hello java(�̿ϼ�)
 * ���� 19-1
 * ���� 19-2:������� �۵��ϴ� hello java(�ϼ�)
 */
public class WindowExample1 {
	public static void main(String[] args){
		JFrame frame = new JFrame("Hello java Program.");
		frame.setLocation(500,400);
		frame.setPreferredSize(new Dimension(300, 200));
		Container contentPane = frame.getContentPane();
		JLabel label = new JLabel("Hello, java!",SwingConstants.CENTER);
		contentPane.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
