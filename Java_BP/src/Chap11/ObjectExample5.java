package Chap11;

import java.util.GregorianCalendar;

/*
 * 작성일자:2017_03_15
 * 작성자:길경완
 * equals 메소드의 사용 예를 보여주는 프로그램
 * 예제 11-6
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
