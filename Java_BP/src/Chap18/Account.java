package Chap18;
/*
 * �ۼ�����:2017_03_19
 * �ۼ���:����
 * ���� ���� Ŭ����
 * ���� 18-11
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
