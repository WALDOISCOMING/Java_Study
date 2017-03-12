package Chap07;

/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 객체를 캐스트 하기 전에 instanceof 연산자로 검사하는 예
 * 예제 7-13
 */
public class RefTypeExample10 {
	public static void main(String[] args){
		Account obj1 = new CheckingAccount("111-22-33333333","홍길동",10000000,"4444-5555-6666-7777");
		if(obj1 instanceof CheckingAccount)
			pay((CheckingAccount)obj1);
		else
			System.out.println("캐스트 할 수 없는 타입입니다.");
		
		
		
	}
	
	static void pay(CheckingAccount obj){
		try{
			int amount = obj.pay("5555-6666-7777-8888",47000);
			System.out.println(amount);
			System.out.println(obj.cardNo);
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
	}
	
}
