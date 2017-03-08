package Chap04;

/*
 * 작성일자:2017_03_08
 * 작성자:길경완
 * 대입 연산자가 산출하는 값을 이용하는 프로그램
 * 예제 4-5 
 */
public class AssignmentExample3 {
	public static void main(String[] args){
		int num1,num2;
		num2 = (num1=10);
		System.out.println(num1);
		System.out.println(num2);
	}
}
