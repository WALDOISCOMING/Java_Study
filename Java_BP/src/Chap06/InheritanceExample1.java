package Chap06;

/*
 * 작성일자:2017_03_10
 * 작성자:길경완
 * 직불 계좌 ㅡㄹ래스를 사용하는 프로그램
 * 예제 6-3
 */
public class InheritanceExample1{
	public static void main(String[] args){
		CheckingAccount obj = new CheckingAccount();
		obj.accountNo = "111-22-33333333";
		obj.ownerName = "홍길동";
		obj.cardNo = "5555-6666-7777-8888";
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
