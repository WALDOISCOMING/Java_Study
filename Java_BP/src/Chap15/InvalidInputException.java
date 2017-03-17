package Chap15;
/*
 * 작성일자:2017_03_17
 * 작성자:길경완
 * 익셉션 클래스의 선언 예
 * 예제 15-9
 */
public class InvalidInputException extends Exception{
	public InvalidInputException() {
	super("잘못된 입력입니다.");
		// TODO Auto-generated constructor stub
	}
}
