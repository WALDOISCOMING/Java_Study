package Chap06;

/*
 * 작성일자:2017_03_10
 * 작성자:길경완
 * 은행 계좌 클래스
 * 예제 6-1
 * 예제 6-2: 생성자가 있는 Account 클래스
 * 예제 6-13: final키워드를 붙여 클래스 상속 금지
 * 예제 6-14: final키워드를 붙여 메소드 상속 금지
 * 예제 6-15: abstract 키워드를 넣어 인스턴스 화 금지
 */
public abstract class Account {
	String accountNo;
	String ownerName;
	int balance;
	public Account() {		
	}
	Account(String accountNo,String ownerName,int balance){
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
