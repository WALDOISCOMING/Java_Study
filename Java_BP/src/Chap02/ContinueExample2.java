package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * continue문의 틀린 사용
 * 예제 2-42
 */
public class ContinueExample2 {
	public static void main(String[] args){
		int cnt = 0;
		while(cnt<10){
			if(cnt==5)
				continue;
			System.out.println(cnt);
			cnt++;
		}
		System.out.println("Done.");
	}
}
