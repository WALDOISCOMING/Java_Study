package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * for문을 이용하여 배열 항목들을 순서대로 처리하는 프로그램
 * 예제 2-36
 */
public class ForExample4 {
	public static void main(String[] args){
		int arr[] = {10,20,30,40,50};
		for(int cnt=0;cnt<arr.length;cnt++){
			System.out.println(arr[cnt]);
		}
		System.out.println("Done.");
	}
}
