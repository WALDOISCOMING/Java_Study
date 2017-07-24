package Chap04;

/*
 * 작성일자:2017_03_08
 * 작성자:길경완
 * +처리 순서를 테스트하는 프로그램
 * 예제 4-4 
 */
public class ConcatExample1 {
	public static void main(String[] args){
		String str1 = "num:"+3+4;
		String str2 = 3 + 4+"num";
		System.out.println(str1);
		System.out.println(str2);
	}
}
