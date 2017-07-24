package Chap11;

/*
 * 작성일자:2017_03_15
 * 작성자:길경완
 * equals 메소드 사용 예를 보여주는 프로그램(2)
 * 예제 11-7
 */
public class ObjectExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(5);
		if(c1.equals(c2))
			System.out.println("같음");
		else
			System.out.println("다름");
	}

}
