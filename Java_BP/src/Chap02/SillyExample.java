package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * 익셉션 발생하는 프로그램
 * 예제 2-48,49는 48의 에러 컨트롤
 */
public class SillyExample {
	public static void main(String[] args){
		int a = 3,b=0;
		int result;
		try{

			result = a/b;
			System.out.println(result);//error 발생
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌려고 했다.");
		}finally {
			System.out.println("Done.");
		}
	}
	
}
