package Chap14;

public class ResourceUser {
	public ResourceUser() {
	System.out.println("�ý��� �ڿ��� �Ҵ� �޽��ϴ�.");
		// TODO Auto-generated constructor stub
	}
	void use(){
		System.out.println("�ý��� �ڿ��� ����մϴ�.");
	}
	protected void finalize(){
		System.out.println("�ý��� �ڿ��� �Ҵ��� �����մϴ�.");
	}
}
