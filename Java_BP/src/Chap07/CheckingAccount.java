package Chap07;

/*
 * �ۼ�����:2017_03_12
 * �ۼ���:����
 * checkingacount Ŭ����
 * ���� 7-8
 */
public class CheckingAccount extends Account {
	String cardNo;
	public CheckingAccount(){
		super();
	}
	public CheckingAccount(String accountNo,String ownerName,int balance,String cardNo) {
		super(accountNo,ownerName,balance);this.cardNo=cardNo;
	}
	
	
	int pay(String cardNo,int amount)throws Exception{
		if(!cardNo.equals(this.cardNo)||(balance<amount))
			throw new Exception("���� �Ұ�!");
		return withdraw(amount);
	}
}
