package Chap06;
/*
 * �ۼ�����:2017_03_12
 * �ۼ���:����
 * Lendable �������̽��� ��� �ʵ带 ����ϴ� ���α׷�
 * ���� 6-27
 */


public class InterfaceExample3 {
	public static void main(String[] args){
		SeparateVolume obj1 = new SeparateVolume("863?774��","����","��������");
		printState(obj1);
		try{
		obj1.checkOut("�迵��","20060315");
		}catch(Exception e){
			System.out.println(e);
		}
		printState(obj1);;
		
	}
	static void printState(SeparateVolume obj){
		if(obj.state==Lendable.STATE_NORMAL){
			System.out.println("---------------");
			System.out.println("�������:���� ����");
			System.out.println("---------------");
		}
		if(obj.state==Lendable.STATE_BORROWED){
			System.out.println("---------------");
			System.out.println("�������:���� ��");
			System.out.println("������:"+obj.borrower);
			System.out.println("������:"+obj.checkOutDate);
			System.out.println("---------------");
		}
	}
}
