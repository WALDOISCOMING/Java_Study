package Chap06;
/*
 * �ۼ�����:2017_03_12
 * �ۼ���:����
 * Ŭ���� ������ �������� Ȱ���ϴ� ���α׷� 2
 * ���� 6-23
 */
public class InheritanceExample8 {
	public static void main(String[] args){

		EMailSender obj1 = new EMailSender("����","������","a@a.com","10���������� ����");
		SMSSender obj2 = new SMSSender("����","������","02-000-0000","10���������� ����");
		send(obj1,"b@b.com");
		send(obj1,"c@c.com");
		send(obj2,"010-000-0000");

	}
	
	static void send(MessageSender obj,String recipient){
		obj.sendMessage(recipient);
	}
}
