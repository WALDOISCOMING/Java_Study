package Chap06;

/*
 * �ۼ�����:2017_03_10
 * �ۼ���:����
 * �߻� �޼ҵ带 �����ϴ� Ŭ����- �޽��� �߼� Ŭ����
 * ���� 6-17
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
