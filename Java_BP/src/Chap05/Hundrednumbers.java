package Chap05;

/*
 * 작성일자:2017_03_09
 * 작성자:길경완
 * 정적 초기화 블록 포함하는 예
 * 예제 5-40
 */
public class Hundrednumbers{
	static int arr[];
	static{
		arr = new int[100];
		for(int cnt=0;cnt<100;cnt++)
			arr[cnt] = cnt;
	}
}
