package Chap09;
/*
 * 작성일자:2017_03_13
 * 작성자:길경완
 * StringBuilder 객체의 버퍼 크기를 문자열에 맞게 줄이는 프로그램
 * 예제 9-9
 */
public class StringBuilderExample4 {

	public static void main(String[] args) {
	StringBuilder sb = new StringBuilder(100);
    sb.append("자바");
    System.out.println(sb+":"+sb.capacity());
    sb.trimToSize();
    System.out.println(sb+":"+sb.capacity());
	}
	
}	
