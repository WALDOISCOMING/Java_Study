package Chap09;
import java.util.StringTokenizer;
/*
 * 작성일자:2017_03_13
 * 작성자:길경완
 * StringTokenizer를 이용해서 문자열로부터 토큰을 분리하는 프로그램
 * 예제 9-10
 */

public class StringTokenizerExample1 {
	public static void main(String[] args){
		StringTokenizer stok = new StringTokenizer("사과 배 복숭아");
		while(stok.hasMoreTokens()){
			String str=stok.nextToken();
			System.out.println(str);
		}
	}
}
