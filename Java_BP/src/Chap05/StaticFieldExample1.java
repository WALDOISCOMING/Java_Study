package Chap05;

/*
 * 작성일자:2017_03_09
 * 작성자:길경완
 * Accumlate 클래스 이용
 * 예제 5-34
 * 예제 5-38 :정적 메소드를 호출하는 프로그램
 */
public class StaticFieldExample1 {
	public static void main(String[] args){
		Accumlator obj1 = new Accumlator();
		Accumlator obj2 = new Accumlator();
		obj1.accumlate(10);
		obj2.accumlate(20);
		int getTotal = Accumlator.getGrandTotal();
		System.out.println(obj1.total);
		System.out.println(getTotal);
		System.out.println(obj2.total);
		System.out.println(getTotal);
	}
}
