package Chap06;
/*
 * �ۼ�����:2017_03_12
 * �ۼ���:����
 * ���� ���� �������̽��� �����ϴ� ���ົ Ŭ����
 * ���� 6-25
 * ���� 6-31: ���� ���� �������̽��κ��� ��� �ʵ带 ��ӹ޴� ���ົ Ŭ����
 * ���� 6-33: checkOut �޼ҵ� ������ �ͼ����� ������ ���ົ Ŭ����
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
			throw new Exception("���� �Ұ�!"+bookTitle);
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state=STATE_BORROWED;
		System.out.println(bookTitle+"�� ����Ǿ��ֽ��ϴ�.");
		System.out.println("������"+borrower);
		System.out.println("������"+date+"\n");
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		this.borrower=null;
		this.checkOutDate = null;
		this.state=STATE_NORMAL;
		System.out.println(bookTitle+"�� �ݳ��Ǿ����ϴ�.");
	}
	
}
