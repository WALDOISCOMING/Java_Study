package Chap05;

/*
 * 작성일자:2017_03_09
 * 작성자:길경완
 * 메소드가 밖으로 던지는 익셉션을 처리하는 프로그램
 * 예제 5-27
 */
public class MethodExample4 {
	public static void main(String[] args){
		int arr[] = new int[0];
		Numbers obj = new Numbers(arr);
		try{
		int total = obj.getTotal();
		int avg = obj.getAverage();//err 발생
		System.out.println(total);
		System.out.println(avg);
		}catch(ArithmeticException e){
			System.err.println("err!");
		}
	}
}
