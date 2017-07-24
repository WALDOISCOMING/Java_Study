package Chap05;

/*
 * 작성일자:2017_03_09
 * 작성자:길경완
 * 필드 선언의 예
 * 예제 5-12
 * 예제 5-13: 필드,메소드,생성자의 위치를 바뀌어도 상관 x
 * 예제 5-14: private를 가지는 클래스의 예
 */
public class Circle {
	private double radius;
	Circle(double radius) {
		this.radius =radius;
	}
	double getArea(){
		double area;
		area = radius*radius*3.14;
		return area;
	}
}
