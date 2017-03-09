package Chap05;

/*
 * 작성일자:2017_03_09
 * 작성자:길경완
 * 클래스 안에 선언된 필드를 사용하는 프로그램
 * 예제 5-14
 * 예제 5-15: 클래스에서 private를 선언하여 여기에서 접근 불가능하게 됨./
 */
public class FieldExample2 {
	public static void main(String[] args){
		Circle obj = new Circle(0.0);
//		obj.radius = 5.0;
		double area = obj.getArea();
	//	System.out.println(obj.radius);
		System.out.println(area);
	}
}
