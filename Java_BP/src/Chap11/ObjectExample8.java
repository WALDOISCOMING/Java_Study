package Chap11;

import java.util.GregorianCalendar;

/*
 * �ۼ�����:2017_03_15
 * �ۼ���:����
 * clone �޼ҵ� �������̵��� ��
 * ���� 11-10
 */
public class ObjectExample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec1 = new Rectangle(10,20);
		Rectangle rec2 = (Rectangle) rec1.clone();
		System.out.println(rec1.width);
		System.out.println(rec2.width);
	}

}
