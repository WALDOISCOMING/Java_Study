package Chap12;
/*
 * 작성일자:2017_03_16
 * 작성자:길경완
 * 자동 Unboxking이 일어나느 경우의 예
 * 예제 12-4
 */
public class WrapperExample4 {
	public static void main(String[] args){
		Integer obj= new Integer("10");
		int sum = obj+20;
		System.out.println(sum);
		
	}
}
