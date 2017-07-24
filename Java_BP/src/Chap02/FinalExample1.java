package Chap02;

/*
 * 작성일자:2017_03_06
 * 작성자:길경완
 * final 변수 사용 예
 * 예제 2-12
 */
public class FinalExample1 {
	public static void main(String[] args){
		final double pi = 3.14;
		double radius = 2.0,circum;
		circum = 2*pi*radius;
		System.out.println(circum);
	}
}
