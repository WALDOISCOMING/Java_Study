package Chap07;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 열거 타입에 대해 valueOf메소두를 호출하는 예
 * 예제 7-19
 */
public class EnumExample3 {
	public static void main(String[] args){
		printSeason(Season.SPRING);
		printSeason(Season.SUMMER);
		printSeason(Season.FALL);
		printSeason(Season.WINTER);
	}
	static void printSeason(Season season){
		
		System.out.println(season.value());
	}
}
