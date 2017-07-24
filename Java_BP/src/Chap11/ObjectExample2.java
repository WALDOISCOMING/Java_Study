package Chap11;

/*
 * 작성일자:2017_03_15
 * 작성자:길경완
 * toString 메소드의 사용 예를 보여주는 프로그램(2)
 * 예제 11-2
 */
public class ObjectExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodsStock gs = new GoodsStock("5",100);
		String str = gs.toString();
		System.out.println(str);
	}

}
