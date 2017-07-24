package Chap04;

/*
 * 작성일자:2017_03_08
 * 작성자:길경완
 * 쉬프트 연산자의 사용 예를 보여주는 프로그램1
 * 예제 4-17
 */
public class ShiftExample1 {
	public static void main(String[] args){
		int num=0xFF00FF01;
		int result1 = num<<3;
		int result2 = num>>3;
		int result3 = num>>>3;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
