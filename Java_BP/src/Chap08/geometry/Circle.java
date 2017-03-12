package Chap08.geometry;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 패키지 선언문을 포함하는 클래스
 * 예제 8-1
 */
class Circle {
	int radius;
	Circle(int radiis) {
		this.radius=radiis;
		// TODO Auto-generated constructor stub
	}
	double getArea(){
		return radius*radius*3.14;
	}
}
