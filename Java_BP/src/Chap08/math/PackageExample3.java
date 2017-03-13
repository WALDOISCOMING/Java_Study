package Chap08.math;

/*
 * 작성일자:2017_03_13
 * 작성자:길경완
 * 다른 패키지의 클래스를 사용한는 프로그램-올바른 예
 * 예제 8-6
 */
public class PackageExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chap08.geometry.polygon.Rectangle obj = new Chap08.geometry.polygon.Rectangle(2,3);
		System.out.println(obj.width);
		System.out.println(obj.height);
		System.out.println(obj.getArea());
		
	}

}
