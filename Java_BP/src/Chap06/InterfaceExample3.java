package Chap06;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * Lendable 인터페이스의 상수 필드를 사용하는 프로그램
 * 예제 6-27
 */


public class InterfaceExample3 {
	public static void main(String[] args){
		SeparateVolume obj1 = new SeparateVolume("863?774개","개미","베르베르");
		printState(obj1);
		try{
		obj1.checkOut("김영숙","20060315");
		}catch(Exception e){
			System.out.println(e);
		}
		printState(obj1);;
		
	}
	static void printState(SeparateVolume obj){
		if(obj.state==Lendable.STATE_NORMAL){
			System.out.println("---------------");
			System.out.println("대출상태:대출 가능");
			System.out.println("---------------");
		}
		if(obj.state==Lendable.STATE_BORROWED){
			System.out.println("---------------");
			System.out.println("대출상태:대출 중");
			System.out.println("대출인:"+obj.borrower);
			System.out.println("대출일:"+obj.checkOutDate);
			System.out.println("---------------");
		}
	}
}
