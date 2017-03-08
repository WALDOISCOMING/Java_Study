package Chap04;

/*
 * 작성일자:2017_03_08
 * 작성자:길경완
 * 조건 연산자의 사용 예를 보여주는 프로그램
 * 예제 4-15
 */
public class ConditionalOpExample1 {
	public static void main(String[] args){
		int a=20,b=30,max;
		max = a<b?a:b;
		System.out.println(max);
	}
}
