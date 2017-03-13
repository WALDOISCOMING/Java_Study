package Chap08.math;

import Chap08.geometry.polygon.Rectangle;

/*
 * 작성일자:2017_03_13
 * 작성자:길경완
 * import 선언문 사용 예
 * 예제 8-7
 */
public class PackageExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle obj = new Rectangle(2,3);
		System.out.println(obj.width);
		System.out.println(obj.height);
		System.out.println(obj.getArea());
		
	}

}
