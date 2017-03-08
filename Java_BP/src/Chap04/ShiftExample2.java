package Chap04;

/*
 * 작성일자:2017_03_08
 * 작성자:길경완
 * 쉬프트 연산자의 사용 예를 보여주는 프로그램2
 * 예제 4-18
 */
public class ShiftExample2 {
	public static void main(String[] args){
		int num1=0xFFFFFFFF;
		int num2 = num1<<30;
		int num3 = num1<<31;
		int num4 = num1<<32;
		int num5 = num1<<33;
		int num6 = num1<<34;
		System.out.printf("%08X\n",num1);
		System.out.printf("%08X\n",num2);
		System.out.printf("%08X\n",num3);
		System.out.printf("%08X\n",num4);
		System.out.printf("%08X\n",num5);
		System.out.printf("%08X\n",num6);
	}
}
