package Chap04;

/*
 * 작성일자:2017_03_08
 * 작성자:길경완
 * 캐스트 연산자의 사용예를  보여주는 프로그램
 * 예제 4-20
 */
public class CastExample1 {
	public static void main(String[] args){
		short num1 = (short)300;
		byte num2 = (byte)300;
		int num3 = (int)12.9;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}
}
