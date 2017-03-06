package Chap02;

/*
 * 작성일자:2017_03_06
 * 작성자:길경완
 * 블럭 밖에서 선언된 변수를 블럭 안에서 사용 하는 예
 * 예제 2-11
 */
public class DecExample5 {
	public static void main(String[] args){
		int num = 10;
		{
			num = 30;
		}
		System.out.println(num);
	}
}
