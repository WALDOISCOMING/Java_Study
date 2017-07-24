package Chap15;

/*
 * 작성일자:2017_03_17
 * 작성자:길경완
 * checked exception과 unchecked exception을 던지는 메소드
 * 예제 15-2
 */
public class ExceptionExample4 {
	public static void main(String[] args){
		try{
			int result = div(3,0);
			System.out.println(result);
		}catch(ArithmeticException e){
			System.err.println(e);
		}
	}
	static int div(int a,int b) {
		int result=a/b;
		
		return result;
	}
}
