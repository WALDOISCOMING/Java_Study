package Chap05;

/*
 * 작성일자:2017_03_09
 * 작성자:길경완
 * 상수 필드를 사용하는 프로그램
 * 예제 5-36
 */
public class StaticFieldExample2 {
	public static void main(String[] args){
		LimitedValue v = new LimitedValue();
		v.setValue(200000);
		System.out.println(v.value);
		System.out.println(v.UPPER_LIMIT);
	}
}
