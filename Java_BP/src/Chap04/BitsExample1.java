package Chap04;

/*
 * 작성일자:2017_03_08
 * 작성자:길경완
 * 비트 연산자의 사용 예를 보여주는 프로그램
 * 예제 4-16
 */
public class BitsExample1 {
	public static void main(String[] args){
		int num1 = 0xFFFF0000;
		int num2 = 0xFF00FF00;
		int result1 = num1&num2;
		int result2 = num1|num2;
		int result3 = num1^num2;
		int result4=~num1;
		System.out.printf("%08x\n",result1);
		System.out.printf("%08x\n",result2);
		System.out.printf("%08x\n",result3);
		System.out.printf("%08x\n",result4);
	}
}
