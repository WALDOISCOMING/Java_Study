package Chap11;

import java.util.GregorianCalendar;

/*
 * �ۼ�����:2017_03_15
 * �ۼ���:����
 * equals �޼ҵ��� ��� ���� �����ִ� ���α׷�
 * ���� 11-6
 */
public class ObjectExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar cal1 = new GregorianCalendar(2017,2,15);
		GregorianCalendar cal2 = new GregorianCalendar(2017,2,15);
		if(cal1.equals(cal2))
			System.out.println("value same");
		else
			System.out.println("value not same");
		if(cal1==cal2)
			System.out.println("object same");
		else
			System.out.println("object not same");
	}

}
