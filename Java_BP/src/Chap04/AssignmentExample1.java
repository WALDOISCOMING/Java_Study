package Chap04;

/*
 * 작성일자:2017_03_08
 * 작성자:길경완
 * 수치 타입의 값을 그보다 넓은 범위 타입의 변수에 대입하는 예
 * 예제 4-5 
 */
public class AssignmentExample1 {
	public static void main(String[] args){
		byte num1 = 9;
		byte num2 = num1;
		int num3 = num2;
		long num4 = num3;
		float num5 = num4;
		double num6 = num5;
		System.out.println(num6);
	}
}
