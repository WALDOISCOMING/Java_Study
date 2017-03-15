package Chap11;

import java.util.GregorianCalendar;

/*
 * 작성일자:2017_03_15
 * 작성자:길경완
 * clone 메소드 오버라이딩의 예
 * 예제 11-10
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
