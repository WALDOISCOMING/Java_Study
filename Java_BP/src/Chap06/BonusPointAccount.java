package Chap06;

/*
 * �ۼ�����:2017_03_10
 * �ۼ���:����
 * ���� Ŭ������ �޼ҵ带 ���� ���̵带 �ϴ� ����Ʈ ���� ���� Ŭ����
 * ���� 6-10
 * ���� 6-11:�������̵�� ���� Ŭ������ �޼ҵ带 ȣ���ϴ� ����Ʈ ���� ���� Ŭ����
 */
public class BonusPointAccount extends Account {
	int bonusPoint;
	public BonusPointAccount(){
		super();
	}
	public BonusPointAccount(String accountNo,String ownerName,int balance,int bonusPoint) {
		super(accountNo,ownerName,balance);this.bonusPoint=bonusPoint;
	}
	void deposit(int amount){
		super.deposit(amount);
		bonusPoint+=(int)(amount*0.001);
	}
	
}
