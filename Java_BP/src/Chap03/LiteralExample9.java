package Chap03;


/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * boolean 리터럴 사용 예를 보여주는 프로그램
 * 예제 3-14
 */
public class LiteralExample9 {
	public static void main(String[] args){
		int num = 10000;
		boolean isBig;
		if(num>100)
			isBig=true;
		else
			isBig=false;
		System.out.println(isBig);
	}
}
