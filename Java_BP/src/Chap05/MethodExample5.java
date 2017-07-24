package Chap05;

/*
 * 작성일자:2017_03_09
 * 작성자:길경완
 * 익셉션 발생하는 withdraw 호출
 * 예제 5-30
 */
public class MethodExample5 {
	public static void main(String[] args){
		Account obj = new Account("777-777-7777777","박",10);
		try{
			int amount =  obj.withdraw(10000000);
			System.out.println(amount);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
