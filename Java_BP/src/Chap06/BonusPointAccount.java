package Chap06;

/*
 * 작성일자:2017_03_10
 * 작성자:길경완
 * 슈퍼 클래스의 메소드를 오버 라이드를 하는 포인트 적립 계좌 클래스
 * 예제 6-10
 * 예제 6-11:오버라이드된 슈퍼 클래스의 메소드를 호출하는 포인트 적립 계좌 클래스
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
