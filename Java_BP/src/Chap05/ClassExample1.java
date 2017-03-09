package Chap05;

/*
 * 작성일자:2017_03_09
 * 작성자:길경완
 * GoodStock의 객체를 생성ㅎ여 이용하는 프로그램
 * 예제 5-3
 * 예제 5-5 : 5-4에서 만든 생성자를 이용.
 */
public class ClassExample1 {
	public static void main(String[] args){
		GoodStock obj;
		obj = new GoodStock("52135",200);
		//obj.goodsCode="52135";
		//obj.stockNum = 200;
		System.out.println(obj.goodsCode);
		System.out.println(obj.stockNum);
		obj.addStock(1000);
		System.out.println(obj.goodsCode);
		System.out.println(obj.stockNum);
	}
}
