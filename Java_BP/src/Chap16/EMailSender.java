package Chap16;
/*
 * 작성일자:2017_03_18
 * 작성자:길경완
 * 메시지 송신 클래스와 서브 클래스
 * 예제 16-14
 */
public class EMailSender extends MessageSender{
	String sender;
	String receiver;
	public EMailSender(String sender,String receiver) {
		this.sender=sender;this.receiver=receiver;
		// TODO Auto-generated constructor stub
	}
	@Override
	void send(String message) {
		System.out.println("보내는자:"+sender);
		System.out.println("받는자:"+receiver);
		System.out.println("내용:"+message);
		System.out.println();
		// TODO Auto-generated method stub
		
	}

}
