package Chap06;

/*
 * �ۼ�����:2017_03_10
 * �ۼ���:����
 * ���� Ŭ������ �޼ҵ带 ���� ���̵带 �ϴ� ���̳ʽ� ���� Ŭ����
 * ���� 6-8
 */
public class CreditLineAccount extends Account {
	int creditLine;
	String cardNo;
	public CreditLineAccount(){
		super();
	}
	public CreditLineAccount(String accountNo,String ownerName,int balance,int creditLine) {
		super(accountNo,ownerName,balance);this.creditLine=creditLine;
	}
	int withdraw(int amount)throws Exception{
		if((balance+amount)<amount)
			throw new Exception("������ ����!");
		balance-=amount;
		return amount;
	}
	
}
