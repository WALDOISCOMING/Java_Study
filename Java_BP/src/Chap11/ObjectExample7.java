package Chap11;

import java.util.GregorianCalendar;

/*
 * �ۼ�����:2017_03_15
 * �ۼ���:����
 * clone �޼ҵ带 ȣ���ϴ� ��
 * ���� 11-9
 */
public class ObjectExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar cal1 = new GregorianCalendar(2017,2,15);
		GregorianCalendar cal2 = (GregorianCalendar) cal1.clone();
		System.out.println(cal1);
		System.out.println(cal2);
	}

}
