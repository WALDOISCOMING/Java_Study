package Chap08.math;
import Chap08.geometry.*;
import Chap08.geometry.polygon.*;
/*
 * 작성일자:2017_03_13
 * 작성자:길경완
 * 여러개의 import 선언문을 포함하는 클래스의 예
 * 예제 8-8
 */
public class PackageExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square obj1 = new Square(7);
		Rectangle obj2 = new Rectangle(5,10);
		if(obj1.getArea()>obj2.getArea())
			System.out.println("정사각형이 더 크다");
		else
			System.out.println("정사각형이 직사각형과 같거나 작다");
		
	}

}
