package Chap16;
/*
 * �ۼ�����:2017_03_18
 * �ۼ���:����
 * �޽��� �۽� Ŭ������ ���� Ŭ����
 * ���� 16-14
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
		System.out.println("��������:"+sender);
		System.out.println("�޴���:"+receiver);
		System.out.println("����:"+message);
		System.out.println();
		// TODO Auto-generated method stub
		
	}

}
