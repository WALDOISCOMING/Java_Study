package Chap16;
/*
 * �ۼ�����:2017_03_18
 * �ۼ���:����
 * �޽��� �۽� Ŭ������ ���� Ŭ����
 * ���� 16-14
 */
public class SMSSender extends MessageSender{
	String phoneNo;
	String receivePhoneNo;
	public SMSSender(String phoneNo,String receivePhoneNo) {
		this.phoneNo=phoneNo;this.receivePhoneNo=receivePhoneNo;
		// TODO Auto-generated constructor stub
	}
	@Override
	void send(String message) {
		System.out.println("��������:"+phoneNo);
		System.out.println("�޴���:"+receivePhoneNo);
		System.out.println("����:"+message);
		System.out.println();
		// TODO Auto-generated method stub
		
	}

}
