package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * if문의 사용 예를 보여주는 프로그램
 * 예제 2-24는 2-24의 오류 2-25
 */
public class IfExample4 {
	public static void main(String[] args){
		int num1 = 152;
		int num2 = 173;
		if(num1>num2){
			if(num1>100)
				System.out.println("num1이 더 크다.\n"+"num1 = "+num1);
		}
		else{
			if(num2>100)
				System.out.println("num2이 더 크다.\n"+"num2 = "+num2);
		}
		System.out.println("Done.");
	}
}
