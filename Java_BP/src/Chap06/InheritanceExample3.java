package Chap06;

/*
 * �ۼ�����:2017_03_10
 * �ۼ���:����
 * ���̳ʽ� ���� Ŭ���� ��� Ŭ����
 * ���� 6-9
 */
public class InheritanceExample3{
	public static void main(String[] args){
		CreditLineAccount obj = new CreditLineAccount("111-22-33333333","ȫ�浿",10000,20000000);
		try{
			int amount = obj.withdraw(50000);
			System.out.println(amount);
			System.out.println(obj.balance);
			System.out.println(obj.creditLine);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}
}
