package Chap06;

/*
 * �ۼ�����:2017_03_10
 * �ۼ���:����
 * �̸��� �۽� Ŭ������ ���� �޽��� �۽� Ŭ������ ����ϴ� ���α׷�
 * ���� 6-20
 */
public class InheritanceExample6{
	public static void main(String[] args){
		EMailSender obj1 = new EMailSender("����","������","a@a.com","10% �������� ����Ǿ���!");
		SMSSender obj2 = new SMSSender("����","������","02-000-0000","10% �������� ����Ǿ���!");
		obj1.sendMessage("b@b.com");
		obj2.sendMessage("010-000-0000");
	}
}
