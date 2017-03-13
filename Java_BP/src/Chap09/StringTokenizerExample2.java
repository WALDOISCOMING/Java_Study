package Chap09;
import java.util.StringTokenizer;
/*
 * 작성일자:2017_03_13
 * 작성자:길경완
 * 공백 문자가 아닌 구획 문자를 이용하여 토큰을 추출하는 예
 * 예제 9-11
 */

public class StringTokenizerExample2 {
	public static void main(String[] args){
		StringTokenizer stok = new StringTokenizer("사과,배a복숭아.고기",",.a");
		while(stok.hasMoreTokens()){
			String str=stok.nextToken();
			System.out.println(str);
		}
	}
}
