package Chap16;

/*
 * 작성일자:2017_03_18
 * 작성자:길경완
 * 정적 네스티드 클래스의 객체를 생성하는 프로그램
 * 예제 16-9
 */
public class NestedClassExample6 {
	public static void main(String[] args){
		Line.Point point = new Line.Point(100,200);
		printPoint(point);
		
	}
	static void printPoint(Line.Point point){
		System.out.printf("(%d %d) %n",point.x,point.y);
	}
}
