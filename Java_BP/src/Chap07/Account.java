package Chap07;

/*
 * �ۼ�����:2017_03_12
 * �ۼ���:����
 * ���� ���� Ŭ����
 * ���� 7-8
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
			throw new Exception("�ܾ׺���!");
		balance-=amount;
		return amount;
		
	}
}
