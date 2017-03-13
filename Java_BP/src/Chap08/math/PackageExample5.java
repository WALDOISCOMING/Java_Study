package Chap08.math;
import Chap08.geometry.polygon.Rectangle;
import Chap08.geometry.Circle;
/*
 * 작성일자:2017_03_13
 * 작성자:길경완
 * 여러개의 import 선언문을 포함하는 클래스의 예
 * 예제 8-8
 */
public class PackageExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj1 = new Circle(5);
		Rectangle obj2 = new Rectangle(8,9);
		if(obj1.getArea()>obj2.getArea()){
			System.out.println("원이 더 크다");
		}
		else{
			System.out.println("원이 직사각형과 같거나 작다");
		}
		
	}

}
