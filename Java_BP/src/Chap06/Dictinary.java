package Chap06;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * Ledable 인터페이스 구현-잘못된 예
 * 예제 6-28
 */
public class Dictinary implements Lendable{
	String title;
	public Dictinary(String title) {
		this.title=title;
		// TODO Auto-generated constructor stub
	}
	//->아래의 예시들이 없다는 전제였다.
	@Override
	public void checkOut(String borrower, String date) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		
	}
}
