package Chap07;

/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * checkingacount 클래스
 * 예제 7-8
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
			throw new Exception("지불 불가!");
		return withdraw(amount);
	}
}
