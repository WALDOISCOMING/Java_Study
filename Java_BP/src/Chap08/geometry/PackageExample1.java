package Chap08.geometry;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 같은 패키지의 클래스를 사용하는 프로그램
 * 예제 8-3
 */
public class PackageExample1 {
	public static void main(String[] args){
		Circle obj = new Circle(5);
		System.out.println("반지름:"+obj.radius);
		System.out.println("면적:"+obj.getArea());
	}
}
