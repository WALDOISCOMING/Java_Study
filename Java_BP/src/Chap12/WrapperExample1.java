package Chap12;
/*
 * 작성일자:2017_03_16
 * 작성자:길경완
 * Wrapper 클래스의 사용 예를 보여주는 프로그램
 * 예제 12-1
 */
public class WrapperExample1 {
	public static void main(String[] args){
		Integer obj1 = new Integer(12);
		Integer obj2 = new Integer(7);
		int sum = obj1.intValue()+obj2.intValue();
		System.out.println(sum);
		
	}
}
