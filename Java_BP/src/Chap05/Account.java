package Chap05;

/*
 * 작성일자:2017_03_09
 * 작성자:길경완
 * 클래스 기능을 구현하는 메소드 선언
 * 예제 5-21
 * 예제 5-28 잔액 부족시 exception 발생하도록 함.
 * 예제 5-29 throws Exception 추가
 */
public class Account {
	String accountNo;
	String ownerName;
	int balance;
	Account(String accountNo,String ownerName,int balance) {
		this.accountNo=accountNo;this.ownerName=ownerName;this.balance=balance;
	}
	void deposit(int amount){
		balance+=amount;
	}
	int withdraw(int amount)throws Exception{
		if(balance<amount)
			throw new Exception("잔액부족!!!!");
		balance-=amount;
		return amount;
	}
}
