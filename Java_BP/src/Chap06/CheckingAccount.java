package Chap06;

/*
 * �ۼ�����:2017_03_10
 * �ۼ���:����
 * ���� ���� Ŭ������ ����ϴ� ���� ���� Ŭ����
 * ���� 6-2
 * ���� 6-4: �����ڰ� �߰��ȴ�.
 * ���� 6-7: ���� Ŭ���� �����ڸ� ȣ��
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
