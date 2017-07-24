package Chap04;

/*
 * 작성일자:2017_03_08
 * 작성자:길경완
 * 논리 연산자의 사용 예를 보여주는 프로그램
 * 예제 4-13
 */
public class LogicalExample1 {
	public static void main(String[] args){
		int a =3,b=4,c=3,d=5;
		if((a==2||a==c)&!(c>d)&(1==b^c!=d))
			System.out.println("맞다");
		else
			System.out.println("안맞다");
	}
}
