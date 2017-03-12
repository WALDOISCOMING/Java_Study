package Chap07;

/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 슈퍼 클래스 변수값을 캐스트 연산해서 서브 클래스 변수에 대입하는 프로그램
 * 예제 7-11
 */
public class RefTypeExample8 {
	public static void main(String[] args){
		Account obj1 = new CheckingAccount("111022033333333","홍길동",10000000,"4444-5555-6666-7777");
		CheckingAccount obj2 = (CheckingAccount)obj1;
		try{
			int amount = obj2.pay("4444-5555-6666-7777",47000);
			System.out.println(amount);
			System.out.println(obj2.cardNo);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}
