package Chap06;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 클래스 변수의 다형성을 활용하는 프로그램 2
 * 예제 6-23
 */
public class InheritanceExample8 {
	public static void main(String[] args){

		EMailSender obj1 = new EMailSender("생축","고객센터","a@a.com","10퍼할인쿠폰 발행");
		SMSSender obj2 = new SMSSender("생축","고객센터","02-000-0000","10퍼할인쿠폰 발행");
		send(obj1,"b@b.com");
		send(obj1,"c@c.com");
		send(obj2,"010-000-0000");

	}
	
	static void send(MessageSender obj,String recipient){
		obj.sendMessage(recipient);
	}
}
