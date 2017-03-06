package Chap02;

/*
 * 작성일자:2017_03_06
 * 작성자:길경완
 * final 변수의 잘못된 사용 예
 * 예제 2-13
 */
public class FinalExample2 {
	public static void main(String[] args){
		final double pi;
		double radius = 2.0,circum;
		pi=3.14;
		circum = 2*pi*radius;
		System.out.println(circum);
//		pi=3.14159;또 다른 값을 넣는 잘못된 명령문
		double area= 2*pi*radius*radius;
		System.out.println(area);
	}
}
