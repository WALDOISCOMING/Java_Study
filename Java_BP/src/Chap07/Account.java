package Chap07;

/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 은행 계좌 클래스
 * 예제 7-8
 */
public abstract class Account {
	String accountNo;
	String ownerName;
	int balance;
	public Account() {		
	}
	public Account(String accountNo,String ownerName,int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance =balance;
	}
	void deposit(int amount){
		balance+=amount;
	}
	int withdraw(int amount)throws Exception{
		if(balance<amount)
			throw new Exception("잔액부족!");
		balance-=amount;
		return amount;
		
	}
}
