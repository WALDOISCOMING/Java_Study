package Chap07;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 하나의 객체를 두개의 변수에 대입하는 프로그램
 * 예제 7-2
 */
public class RefTypeExample1 {
	public static void main(String[] args){
		Point obj1 = new Point(10,20);
		Point obj2 = obj1;
		System.out.printf("(%d,%d)%n",obj1.x,obj1.y);
		System.out.printf("(%d,%d)%n",obj2.x,obj2.y);
		obj2.x=30;
		System.out.printf("(%d,%d)%n",obj1.x,obj1.y);
		System.out.printf("(%d,%d)%n",obj2.x,obj2.y);
	}
}
