package Chap18.kr.co.bsw;

/*
 * 작성일자:2017_03_19
 * 작성자:길경완
 * 특정 패키지에 속하는 numbers 클래스
 * 예제 18-7
 */


public class Numbers {
	protected void list(int start,int end) {
		for(int cnt=start;cnt<end;start++)
			System.out.printf("(%d)",cnt);
	}
}
