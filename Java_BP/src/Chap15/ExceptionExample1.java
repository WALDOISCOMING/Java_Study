package Chap15;

/*
 * 작성일자:2017_03_17
 * 작성자:길경완
 * checked exception과 unchecked exception을 발생하는 프로그램
 * 예제 15-1
 */
public class ExceptionExample1 {
	public static void main(String[] args){
		int sum = 1+ -2;
		if(sum<0)
		//	throw new Exception("에러 발생");
		System.out.println(sum);
	}
}
