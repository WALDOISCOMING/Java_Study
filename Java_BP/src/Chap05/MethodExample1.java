package Chap05;

/*
 * �ۼ�����:2017_03_09
 * �ۼ���:����
 * Account �޼ҵ带 ȣ���ϴ� ���α׷���
 * ���� 5-22
 */
public class MethodExample1 {
	public static void main(String[] args){
		Account obj1 = new Account("111-222-33333333","�迵��",20000);
		Account obj2 = new Account("555-666-77777777","������",100000);
		obj1.deposit(100000);
		try {
			obj2.withdraw(20000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		printAccount(obj1);
		printAccount(obj2);
	}
	static void printAccount(Account obj){
		System.out.println(obj.accountNo);
		System.out.println(obj.ownerName);
		System.out.println(obj.balance);
		System.out.println();
	}
}
