package Chap05;

/*
 * 작성일자:2017_03_09
 * 작성자:길경완
 * Account 메소드를 호출하는 프로그램ㅁ
 * 예제 5-22
 */
public class MethodExample1 {
	public static void main(String[] args){
		Account obj1 = new Account("111-222-33333333","김영식",20000);
		Account obj2 = new Account("555-666-77777777","박진희",100000);
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
