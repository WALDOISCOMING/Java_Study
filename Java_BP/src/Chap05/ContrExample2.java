package Chap05;
/*
 * �ۼ�����:2017_03_09
 * �ۼ���:����
 * �� �����ڸ� ���� Ŭ������ ��ü�� �����ϴ� ���α׷�
 * ���� 5-7
 * ���� 5-9:�Ķ���� ���� ������
 */
public class ContrExample2 {
	public static void main(String[] args){
		SubscriberInfo obj1,obj2,obj3;
		obj1 = new SubscriberInfo("�����","poorman","zebi");
		obj2 = new SubscriberInfo("�����", "richman","money","02-000-0000","Ÿ���縮��");
		obj3 = new SubscriberInfo();
		printSubscrberInfo(obj1);
		printSubscrberInfo(obj2);
		printSubscrberInfo(obj3);
	}
	static void printSubscrberInfo(SubscriberInfo obj){
		System.out.println("�̸�:"+obj.name);
		System.out.println("���̵�:"+obj.id);
		System.out.println("�н�����:"+obj.password);
		System.out.println("��ȭ��ȣ:"+obj.phoneNo);
		System.out.println("�ּ�:"+obj.address);
		System.out.println("");

	}
}
