package Chap11;

/*
 * 작성일자:2017_03_15
 * 작성자:길경완
 * System.out.println 메소드에 의해 toString이 간접적으로 호출된다는 것을 보여주는 예
 * 예제 11-5
 */
public class ObjectExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodsStock gs = new GoodsStock("5",100);
		System.out.println(gs);
	}

}
