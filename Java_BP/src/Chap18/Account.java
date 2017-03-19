package Chap18;
/*
 * 작성일자:2017_03_19
 * 작성자:길경완
 * 은행 계좌 클래스
 * 예제 18-11
 */
class Account {
	String accountNo;
	String ownerNo;
	int balance;
	Account(String accountNo,String ownerNo,int balance) {
		this.accountNo=accountNo;this.ownerNo=ownerNo;this.balance=balance;
		// TODO Auto-generated constructor stub
	}
	void deposit(int amount){
		balance+=amount;
	}
	int withdraw(int amount){
		if(balance<amount)
			return 0;
		balance-=amount;
		return amount;
	}
}
