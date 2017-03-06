package Chap02;

import java.util.concurrent.SynchronousQueue;

/*
 * 작성일자:2017_03_06
 * 작성자:길경완
 * 블럭 안에 변수 잘못 사용한 예
 * 예제 2-10
 */
public class DecExample4 {
	public static void main(String[] args){
		{
			int num = 10;
		}
//		System.out.println(num);블럭 밖이므로 인식 되지가 않는다.
	}
}
