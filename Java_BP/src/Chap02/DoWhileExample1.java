package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * do-while문의 사용 예를 보여주는 프로그램
 * 예제 2-32
 */
public class DoWhileExample1 {
	public static void main(String[] args){
		int cnt = 0;
		do{
			System.out.println(cnt);
			cnt++;
		}while(cnt<10);
		System.out.println("Done.");
	}
}
