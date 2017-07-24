package Chap06;

/*
 * 작성일자:2017_03_10
 * 작성자:길경완
 * 메시지 발송 클래스를 상속하는 클래스- 잘못된 예
 * 예제 6-21
 */
public  class SillySender extends MessageSender {
	public SillySender(String title,String senderName) {
		super(title, senderName);
	}
//아래가 없으면 오류 발생
	@Override
	void sendMessage(String recipient) {
		// TODO Auto-generated method stub
		
	}
	
}
