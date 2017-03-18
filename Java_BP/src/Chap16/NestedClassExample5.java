package Chap16;

/*
 * 작성일자:2017_03_18
 * 작성자:길경완
 * 직선 클래스와 점 클래스를 사용하는 프로그램
 * 예제 16-8
 */
public class NestedClassExample5 {
	public static void main(String[] args){
		Line line = new Line(0,0,100,100);
		line.move(10,20);
		printPoint(line.point1);
		printPoint(line.point2);
		
	}
	static void printPoint(Line.Point point){
		System.out.printf("(%d %d) %n",point.x,point.y);
	}
}
