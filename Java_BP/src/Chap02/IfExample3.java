package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * 2중 if 프로그램
 * 예제 2-23
 */
public class IfExample3 {
	public static void main(String[] args){
		int num1 = 52;
		int num2 = 24;
		int num3 = 32;
		if(num1>num2)
			if(num1>num3)
				System.out.println("num1 최고로 크다. ");
			
		System.out.println("Done.");
	}
}
