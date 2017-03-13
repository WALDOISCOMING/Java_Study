package Chap09;
import java.util.StringTokenizer;
/*
 * 작성일자:2017_03_13
 * 작성자:길경완
 * 구획 문자를 토큰으로 추출하는 예
 * 예제 9-12
 */

public class StringTokenizerExample3 {
	public static void main(String[] args){
		StringTokenizer stok = new StringTokenizer(
				"사과=10|배=3|샴페인=1","=|",true);
		while(stok.hasMoreTokens()){
			String token=stok.nextToken();
			if(token.equals("="))
				System.out.print("\t");
			else if(token.equals("|"))
				System.out.print("\n");
			else
				System.out.print(token);
		}
	}
}
