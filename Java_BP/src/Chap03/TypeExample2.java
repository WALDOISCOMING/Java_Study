package Chap03;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * 부동소수점 수를 0으로 나누는 프로그램
 * 예제 3-5
 */
public class TypeExample2 {
	public static void main(String[] args){
		
		double result1,result2;
		result1 = 2.0/0.0;
		result2 = -2.0/0.0;
		System.out.println(result1);
		System.out.println(result2);
	}
}
