package Chap06;
/*
 * �ۼ�����:2017_03_12
 * �ۼ���:����
 * Ŭ���� ������ �������� Ȱ���ϴ� ���α׷� 1
 * ���� 6-22
 */
public class InheritanceExample7 {
	public static void main(String[] args){

//		Account obj1 = new Account("111-22-333333","�Ӳ���",10000,"");
		Account obj2 = new CheckingAccount("444-55-666666","ȫ�浿",20000,"5555-6666-7777-8888");
		Account obj3 = new CreditLineAccount("777-88-999999","�輱��",30000,20000000);
		Account obj4 = new BonusPointAccount("000-00-000000","��̿�",0,0);
		printAccountInfo(obj2);
		printAccountInfo(obj3);
		printAccountInfo(obj4);
		
	}
	
	static void printAccountInfo(Account obj){
		System.out.println(obj.accountNo);
		System.out.println(obj.ownerName);
		System.out.println(obj.balance);
		System.out.println();
	}
}
