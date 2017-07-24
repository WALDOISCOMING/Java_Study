package Chap04;

/*
 * 작성일자:2017_03_08
 * 작성자:길경완
 * 증가 연산자와 감소 연산자가 산출하는 값을 출력하는 프로그램
 * 예제 4-8
 */
public class IncDecExample1 {
	public static void main(String[] args){
		int num1=0,num2=0,num3=0,num4=0;
		int result1=num1++;
		int result2=num2--;
		int result3=++num3;
		int result4=--num4;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}
