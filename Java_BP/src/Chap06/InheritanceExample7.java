package Chap06;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 클래스 변수의 다형성을 활용하는 프로그램 1
 * 예제 6-22
 */
public class InheritanceExample7 {
	public static void main(String[] args){

//		Account obj1 = new Account("111-22-333333","임꺽정",10000,"");
		Account obj2 = new CheckingAccount("444-55-666666","홍길동",20000,"5555-6666-7777-8888");
		Account obj3 = new CreditLineAccount("777-88-999999","김선달",30000,20000000);
		Account obj4 = new BonusPointAccount("000-00-000000","김미영",0,0);
		printAccountInfo(obj2);
		printAccountInfo(obj3);
		printAccountInfo(obj4);
		
	}
	
	static void printAccountInfo(Account obj){
		System.out.println(obj.accountNo);
		System.out.println(obj.ownerName);
		System.out.println(obj.balance);
		System.out.println();
	}
}
