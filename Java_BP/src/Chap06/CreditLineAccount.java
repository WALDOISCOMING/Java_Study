package Chap06;

/*
 * 작성일자:2017_03_10
 * 작성자:길경완
 * 슈퍼 클래스의 메소드를 오버 라이드를 하는 마이너스 통장 클래스
 * 예제 6-8
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
			throw new Exception("인출이 부족!");
		balance-=amount;
		return amount;
	}
	
}
