package Chap06;

/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 변환 인터페이스를 구현하는 사각형 클래스
 * 예제 6-37
 */

public class InterfaceExample4 {
	public static void main(String[] args){
		Rectangle obj = new Rectangle(100,200, 10,10);
		printRectangle(obj);
		obj.moveTo(25,35);
		printRectangle(obj);
		obj.moveBy(-5, -5);
		printRectangle(obj);
		obj.resize(30,30);
		printRectangle(obj);
	}
	static void printRectangle(Rectangle obj){
		System.out.printf("[x,y:%d,%d]\t(%dx%d)\n",obj.x,obj.y,obj.height,obj.width);
	}
}
