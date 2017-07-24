package Chap09;
/*
 * 작성일자:2017_03_13
 * 작성자:길경완
 * equals 메소드를 이용한 문자열 비교 프로그램
 * 예제 9-3
 */
public class StringExample4 {

	public static void main(String[] args) {
		String str1 = "자바";
		String str2 = "자바";
		if(str1.equals(str2)){
			System.out.println("동일");
		}else{
			System.out.println("동일x");
		}
		
	}

}
