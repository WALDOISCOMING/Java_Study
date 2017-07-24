package Chap06;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 대출 가능 인터페이스
 * 예제 6-24
 * 예제 6-30: 상수 필드가 추가된 대출 가능 인터페이스
 * 예제 6-34: 추상 메소드에 throws절을 추가한 대출 기능 인터페이스
 */
public interface Lendable {
	final static byte STATE_BORROWED=1;//대출중
	final static byte STATE_NORMAL=0;//대출 되지 않은 상태
	abstract void checkOut(String borrower,String date)throws Exception;
	abstract void checkIn();
}
