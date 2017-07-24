package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * while 문의 사용 예를 보여주는 프로그램
 * 예제 2-30,31은 무한루프
 */
public class WhileExample1 {
	public static void main(String[] args){
		int cnt = 0;
		while(cnt<10){
			System.out.println(cnt);
			cnt++;
		}
		System.out.println("Done.");
	}
}
