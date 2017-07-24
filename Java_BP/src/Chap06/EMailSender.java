package Chap06;

/*
 * 작성일자:2017_03_10
 * 작성자:길경완
 * 메시지 발송 클래스를 상속하는 이메일 송신 클래스
 * 예제 6-18
 */
public class EMailSender extends MessageSender {
	String senderAddr;
	String emailBody;
	public EMailSender(String title,String senderName,String senderAddr,String emailBody) {
		super(title, senderName);this.senderAddr=senderAddr;this.emailBody=emailBody;
	}
	
	@Override
	void sendMessage(String recipient) {
		System.out.println("------------------------");
		System.out.println(title);
		System.out.println(senderAddr+","+senderName);
		System.out.println(recipient);
		System.out.println(emailBody);		
	}
	
	
}
