package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * for-each문을 사용 프로그램
 * 예제 2-37
 */
public class ForExample5 {
	public static void main(String[] args){
		int arr[] = {10,20,30,40,50};
		for(int cnt:arr){
			System.out.println(arr[cnt]);
		}
		System.out.println("Done.");
	}
}
