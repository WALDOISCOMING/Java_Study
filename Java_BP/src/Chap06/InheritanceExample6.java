package Chap06;

/*
 * 작성일자:2017_03_10
 * 작성자:길경완
 * 이메일 송신 클래스와 문자 메시지 송신 클래스를 사용하는 프로그램
 * 예제 6-20
 */
public class InheritanceExample6{
	public static void main(String[] args){
		EMailSender obj1 = new EMailSender("생축","고객센터","a@a.com","10% 할인쿠폰 발행되었다!");
		SMSSender obj2 = new SMSSender("생축","고객센터","02-000-0000","10% 할인쿠폰 발행되었다!");
		obj1.sendMessage("b@b.com");
		obj2.sendMessage("010-000-0000");
	}
}
