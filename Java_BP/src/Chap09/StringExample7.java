package Chap09;
/*
 * 작성일자:2017_03_13
 * 작성자:길경완
 * string 클래스의 믄지열 조작 메소드 사용 예
 * 예제 9-5
 */
public class StringExample7 {

	public static void main(String[] args) {
		String str1 ="    Let it be.   ";
		String str2 =str1.trim();
		System.out.println(str2);
		System.out.println(str2.concat("Speaking words of wisdom."));
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str2.replace('e','a'));
		System.out.println(str1);
		System.out.println(str2);
	}

}
