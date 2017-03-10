package Chap06;

/*
 * 작성일자:2017_03_10
 * 작성자:길경완
 * 은행 계좌 클래스를 상속하는 직불 계좌 클래스
 * 예제 6-2
 * 예제 6-4: 생성자가 추가된다.
 * 예제 6-7: 슈퍼 클래스 생성자를 호출
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
