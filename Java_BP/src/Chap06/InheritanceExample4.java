package Chap06;

/*
 * �ۼ�����:2017_03_10
 * �ۼ���:����
 * ����Ʈ ���� ���� Ŭ������ ����ϴ� ���α׷�
 * ���� 6-12
 */
public class InheritanceExample4{
	public static void main(String[] args){
		BonusPointAccount obj = new BonusPointAccount("333-33-333333","ȫ�浿",0,0);
		obj.deposit(1000000);
		System.out.println(obj.balance);
		System.out.println(obj.bonusPoint);
		
	}
}
