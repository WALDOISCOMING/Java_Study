package Chap06;

/*
 * �ۼ�����:2017_03_10
 * �ۼ���:����
 * �޽��� �߼� Ŭ������ ����ϴ� �̸��� �۽� Ŭ����
 * ���� 6-18
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
