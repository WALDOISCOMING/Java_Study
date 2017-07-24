package Chap08.math;
/*
 * 작성일자:2017_03_13
 * 작성자:길경완
 * 다른 패키지의 private 메소드를 호출하는 잘못된 예
 * 예제 8-11
 */
public class AccessControlExample1 {
	public static void main(String[] args){
		Fraction obj = new Fraction(100,3);
		//System.out.println(obj.getDouble());err
	}
}
