package Chap04;

/*
 * 작성일자:2017_03_08
 * 작성자:길경완
 * 우선순위가 다른 여러 연산자를 함꼐 사용한 연산식의 예
 * 예제 4-21
 */
public class OrderExample1 {
	public static void main(String[] args){
		int a=2,b=3,c=5;
		double d=4.0,e=0.5,f;
		f = a+b==c?d:e;
		System.out.println(f);
	}
}
