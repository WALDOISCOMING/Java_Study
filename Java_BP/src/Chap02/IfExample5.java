package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * 자바의 dangling else 규칙을 잘 활용한 프로그램
 * 예제 2-26
 */
public class IfExample5 {
	public static void main(String[] args){
		int num = 74;
		if(num<10)
			System.out.println("num의 값은 10 미만입니다.");
		else if(num<100)
			System.out.println("num은 10 이상 100 미만입니다.");
		else if(num<1000)
			System.out.println("num은 100이상 1000미만입니다.");
		else
			System.out.println("num의 값은 1000이상입니다.");
	}
}
