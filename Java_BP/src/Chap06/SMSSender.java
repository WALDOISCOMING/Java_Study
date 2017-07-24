package Chap06;

/*
 * 작성일자:2017_03_10
 * 작성자:길경완
 * 메시지 발송 클래스를 상속하는 문자 메시지 송신 클래스
 * 예제 6-19
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
