package Chap06;

/*
 * 작성일자:2017_03_10
 * 작성자:길경완
 * 추상 메소드를 포함하는 클래스- 메시지 발송 클래스
 * 예제 6-17
 */
public abstract class MessageSender {
	String title;
	String senderName;
	public MessageSender(String title,String senderName) {
		this.title=title;
		this.senderName=senderName;
	}
	abstract void sendMessage(String recipient);
	
}
