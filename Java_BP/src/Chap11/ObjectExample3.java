package Chap11;

/*
 * 작성일자:2017_03_15
 * 작성자:길경완
 * 문자열 연결 연산자에 의해 toString이 자동적으로 호출되는 예
 * 예제 11-4
 */
public class ObjectExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodsStock gs = new GoodsStock("5",100);
		String str = "제고정보=\n"+gs;
		System.out.println(str);
	}

}
