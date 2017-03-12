package Chap06;
/*
 * �ۼ�����:2017_03_12
 * �ۼ���:����
 * ���� ���� �������̽��� �����ϴ� CD Ŭ����
 * ���� 6-26
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
			throw new Exception("����Ұ�"+title);
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state=1;
		System.out.println(title+"�� ����Ǿ��ֽ��ϴ�.");
		System.out.println("������"+borrower);
		System.out.println("������"+date+"\n");
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		this.borrower=null;
		this.checkOutDate = null;
		this.state=0;
		System.out.println(title+"�� �ݳ��Ǿ����ϴ�.");
	}
	
}
