package Chap06;

/*
 * �ۼ�����:2017_03_10
 * �ۼ���:����
 * �޽��� �߼� Ŭ������ ����ϴ� ���� �޽��� �۽� Ŭ����
 * ���� 6-19
 */
public class SMSSender extends MessageSender {
	
	String returnPhoneNo;
	String message;
	public SMSSender(String title, String senderName,String returnPhonNo,String message) {
		super(title, senderName);this.returnPhoneNo=returnPhonNo;this.message=message;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	void sendMessage(String recipient) {
		System.out.println("------------------------");
		System.out.println(title);
		System.out.println(returnPhoneNo+","+senderName);
		System.out.println(recipient);
		System.out.println(message);		
	}
	
	
}
