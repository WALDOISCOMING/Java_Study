package Chap11;

import java.util.GregorianCalendar;

/*
 * 작성일자:2017_03_15
 * 작성자:길경완
 * clone 메소드를 호출하는 예
 * 예제 11-9
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
