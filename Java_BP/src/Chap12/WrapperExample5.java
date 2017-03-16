package Chap12;
/*
 * 작성일자:2017_03_16
 * 작성자:길경완
 * 자동 Boxing의 예
 * 예제 12-5
 */
public class WrapperExample5 {
	public static void main(String[] args){
		printDouble(new Double(123.45));
		printDouble(123.45);
	}
	static void printDouble(Double obj){
		System.out.println(obj);
	}
}
