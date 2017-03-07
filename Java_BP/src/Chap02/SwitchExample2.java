package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * 둘 이상의 값에 대해 값은 처리를  하는 switch 예
 * 예제 2-29
 */
public class SwitchExample2 {
	public static void main(String[] args){
		char ch = 'p';
		switch(ch){
		case 'A':
		case 'a':
			System.out.println("GM Java");
			break;
		case 'P':
		case 'p':
			System.out.println("GA Java");
			break;
		case 'G':
		case 'g':
			System.out.println("GE Java");
			break;
		default:
			System.out.println("Hello Java");
			break;
		}
		System.out.println("Done.");
	}
}
