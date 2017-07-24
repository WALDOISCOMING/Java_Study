package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * switch문의 전형적인 사용 예를 보여주는 프로그램
 * 예제 2-27
 */
public class SwitchExample1 {
	public static void main(String[] args){
		int num=3;
		switch(num){
		case 1:
			System.out.println("GM Java");
			break;
		case 2:
			System.out.println("GA Java");
			break;
		case 3:
			System.out.println("GE Java");
			break;
		default:
			System.out.println("Hello Java");
			break;
		}
		System.out.println("Done.");
	}
}
