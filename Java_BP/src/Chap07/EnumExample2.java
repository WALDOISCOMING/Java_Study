package Chap07;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 열거 타입에 대해 valueOf메소두를 호출하는 예
 * 예제 7-19
 */
public class EnumExample2 {
	public static void main(String[] args){
		printDay("MONDAY");
		printDay("SUNDAY");
		printDay("MONDAY");
	}
	static void printDay(String name){
		Day day = Day.valueOf(name);
		System.out.println(day);
	}
}
