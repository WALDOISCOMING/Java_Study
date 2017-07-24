package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * break를 이용하여 반복문 빠져나가기
 * 예제 2-38
 */
public class BreakExample1 {
	public static void main(String[] args){
		
		for(int cnt=0;cnt<10;cnt++){
			System.out.println(cnt);
			if(cnt==5)
				break;
		}
		System.out.println("Done.");
	}
}
