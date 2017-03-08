package Chap04;

/*
 * 작성일자:2017_03_08
 * 작성자:길경완
 * 사칙 연산자의 우선순위를 테스트하는 프로그램
 * 예제 4-1
 */
public class FourRulesExample1 {
	public static void main(String[] args){
		int num1 = 1/2-3;
		double num2 = 2.0+1.5*2.0;
		int num3 = 10/3/2;
		int num4 = 2*5/2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}
}
