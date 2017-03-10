package Chap06;

/*
 * 작성일자:2017_03_10
 * 작성자:길경완
 * 마이너스 통장 클래스 사용 클래스
 * 예제 6-9
 */
public class InheritanceExample3{
	public static void main(String[] args){
		CreditLineAccount obj = new CreditLineAccount("111-22-33333333","홍길동",10000,20000000);
		try{
			int amount = obj.withdraw(50000);
			System.out.println(amount);
			System.out.println(obj.balance);
			System.out.println(obj.creditLine);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}
}
