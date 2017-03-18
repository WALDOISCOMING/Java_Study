package Chap16;


/*
 * 작성일자:2017_03_18
 * 작성자:길경완
 * 돼지 저금통 클래스를 사용하는 프로그램(2)
 * 예제 16-6
 */
public class NestedClassExample4 {
	public static void main(String[] args){
		PiggyBank b1 = new PiggyBank();
		PiggyBank b2 = new PiggyBank();
		PiggyBank.Slot tmp = b1.slot;
		//서로 slot을 바꿔 써 보는 것.
		b1.slot = b2.slot;
		b2.slot =tmp;
		b1.slot.put(10000);
		b2.slot.put(10);
		System.out.println(b1.total);
		System.out.println(b2.total);
	}
	
}
