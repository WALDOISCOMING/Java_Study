package Chap06;

/*
 * �ۼ�����:2017_03_10
 * �ۼ���:����
 * ���� ���� Ŭ������ �����ڸ� ����ϴ� ���α׷�
 * ���� 6-5
 */
public class InheritanceExample2{
	public static void main(String[] args){
		CheckingAccount obj = new CheckingAccount("111-22-33333333","ȫ�浿",0,"5555-6666-7777-8888");
	
		obj.deposit(100000);
		try{
			int paidAmount = obj.pay("5555-6666-7777-8888",47000);
			System.out.println(paidAmount);
			System.out.println(obj.balance);
		}catch(Exception e){
			System.err.println(e.getMessage());
			
		}
	}
}
