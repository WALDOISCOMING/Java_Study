package Chap06;

/*
 * �ۼ�����:2017_03_10
 * �ۼ���:����
 * ���� ���� Ŭ����
 * ���� 6-1
 * ���� 6-2: �����ڰ� �ִ� Account Ŭ����
 * ���� 6-13: finalŰ���带 �ٿ� Ŭ���� ��� ����
 * ���� 6-14: finalŰ���带 �ٿ� �޼ҵ� ��� ����
 * ���� 6-15: abstract Ű���带 �־� �ν��Ͻ� ȭ ����
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
			throw new Exception("�ܾ׺���!");
		balance-=amount;
		return amount;
		
	}
}
