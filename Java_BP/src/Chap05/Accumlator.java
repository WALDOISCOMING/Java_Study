package Chap05;

/*
 * 작성일자:2017_03_09
 * 작성자:길경완
 * 정적필드가 있는 클래스
 * 예제 5-33
 * 예제 5-37 :정적 메소드를 포함하는 클래스
 */
public class Accumlator {
	int total=0;
	static int grandTotal=0;
	void accumlate(int amount){
		total+=amount;
		grandTotal+=amount;
	}
	static int getGrandTotal(){
		return grandTotal;
	}
}
