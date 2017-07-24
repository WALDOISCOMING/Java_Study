package Chap06;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 대출 가능 인터페이스를 구현하는 CD 클래스
 * 예제 6-26
 */
public class AppCDInfo extends CDInfo implements Lendable {
	
	String borrower;
	String checkOutDate;
	byte state;
	public AppCDInfo(String registerNo,String title) {
		super(registerNo,title);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void checkOut(String borrower, String date) throws Exception{
		// TODO Auto-generated method stub
		if(state!=0)
			throw new Exception("대출불가"+title);
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state=1;
		System.out.println(title+"이 대출되어있습니다.");
		System.out.println("대출인"+borrower);
		System.out.println("대출일"+date+"\n");
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		this.borrower=null;
		this.checkOutDate = null;
		this.state=0;
		System.out.println(title+"이 반납되었습니다.");
	}
	
}
