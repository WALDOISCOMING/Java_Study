package Chap06;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 대출 가능 인터페이스를 구현하는 단행본 클래스
 * 예제 6-25
 * 예제 6-31: 대출 가능 인터페이스로부터 상수 필드를 상속받는 단행본 클래스
 * 예제 6-33: checkOut 메소드 밖으로 익셉션을 던지는 단행본 클래스
 */
public class SeparateVolume implements Lendable {
	String requestNo;
	String bookTitle;
	String writer;
	String borrower;
	String checkOutDate;
	byte state;
	public SeparateVolume(String requetNo,String bookTitle,String writer) {
		this.requestNo=requetNo;this.bookTitle=bookTitle;this.writer=writer;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void checkOut(String borrower, String date) throws Exception{
		// TODO Auto-generated method stub
		if(state!=STATE_NORMAL)
			throw new Exception("대출 불가!"+bookTitle);
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state=STATE_BORROWED;
		System.out.println(bookTitle+"이 대출되어있습니다.");
		System.out.println("대출인"+borrower);
		System.out.println("대출일"+date+"\n");
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		this.borrower=null;
		this.checkOutDate = null;
		this.state=STATE_NORMAL;
		System.out.println(bookTitle+"이 반납되었습니다.");
	}
	
}
