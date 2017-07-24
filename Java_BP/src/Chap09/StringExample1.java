package Chap09;
/*
 * 작성일자:2017_03_13
 * 작성자:길경완
 * String 클래스의 length,charAt 메소드 사용 예
 * 예제 9-1
 */
public class StringExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "자바 커피";
		int len = str.length();
		for(int cnt=0;cnt<len;cnt++){
			char ch = str.charAt(cnt);
			System.out.println(ch);
		}
	}

}
