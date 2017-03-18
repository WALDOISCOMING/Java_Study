package Chap16;


/*
 * 작성일자:2017_03_18
 * 작성자:길경완
 * 돼지 저금통 클래스를 사용하는 프로그램(1)
 * 예제 16-5
 */
public class NestedClassExample3 {
	public static void main(String[] args){
		PiggyBank b1 = new PiggyBank();
		PiggyBank b2 = new PiggyBank();
		PiggyBank b3 = new PiggyBank();
		b2.slot.put(100);
		System.out.println(b1.total);
		System.out.println(b2.total);
		System.out.println(b3.total);
	}
	
}
