package Chap06;

/*
 * 작성일자:2017_03_10
 * 작성자:길경완
 * 포인트 적립 계좌 클래스를 사용하는 프로그램
 * 예제 6-12
 */
public class InheritanceExample4{
	public static void main(String[] args){
		BonusPointAccount obj = new BonusPointAccount("333-33-333333","홍길동",0,0);
		obj.deposit(1000000);
		System.out.println(obj.balance);
		System.out.println(obj.bonusPoint);
		
	}
}
