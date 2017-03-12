package Chap07;

/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 변수에 속하지 않는 필드와 메소드를 사용하는 잘못된 프로그램
 * 예제 7-9
 */
public class RefTypeExample6 {
	public static void main(String[] args){
		Account obj = new CheckingAccount("111022033333333","홍길동",10,"4444-5555-6666-7777");
		try{
			//int amount = obj.pay("4444-5555-6666-7777",47000);
		//	System.out.println(amount);
		//	System.out.println(obj.cardNo);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}
