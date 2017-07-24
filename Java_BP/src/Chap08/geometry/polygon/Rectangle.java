package Chap08.geometry.polygon;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 계층적인 이름의 패키지 선언문을 포함하는 클래스
 * 예제 8-2
 * 예제 8-5: 다른패키지에서 사용할 수 있도록 공개된 클래스
 */
public class Rectangle {
	public int width,height;
	public Rectangle(int width,int height) {
	this.width=width;this.height=height;
		// TODO Auto-generated constructor stub
	}
	public int getArea(){
		return width*height;
	}
}
