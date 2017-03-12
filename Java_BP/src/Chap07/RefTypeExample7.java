package Chap07;

/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 슈퍼 클래스 변수의 값을 서브 클래스 변수에 대입하는 잘못된 프로그램
 * 예제 7-10
 */
public class RefTypeExample7 {
	public static void main(String[] args){
		Account obj1 = new CheckingAccount("111022033333333","홍길동",10,"4444-5555-6666-7777");
	//	CheckingAccount obj2 = obj1;
		try{
			//int amount = obj.pay("4444-5555-6666-7777",47000);
		//	System.out.println(amount);
		//	System.out.println(obj.cardNo);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}
