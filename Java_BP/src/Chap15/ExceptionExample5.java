package Chap15;

/*
 * 작성일자:2017_03_17
 * 작성자:길경완
 * getMessage 메소드의 사용 예를 보여주는 프로그램(1)
 * 예제 15-3
 */
public class ExceptionExample5 {
	public static void main(String[] args){
		int num1=2,num2=0;
		try{
			int result = num1/num2;
			System.out.println(result);

			
		}catch(ArithmeticException e){
			System.err.println(e.getMessage());
		}
	}
	
}
