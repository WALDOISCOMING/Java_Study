package Chap07;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 요일을 표현하는 열거타입
 * 예제 7-18
 */
public class EnumExample1 {
	public static void main(String[] args){
		Day days[] = Day.values();
		for (Day day:days){
			System.out.println(day);
		}
	}
}
