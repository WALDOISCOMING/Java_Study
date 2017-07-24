package Chap03;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * booelean 타입의 변수를 선언해서 사용하는 예를 보여주는 프로그램
 * 예제 3-1
 */
public class BooleanExample1 {
	public static void main(String[] args){
		int num=10+20;
		boolean trueth;
		trueth = num>10;
		if (trueth)
			System.out.println("num이 10보다 큼");
	}
}
