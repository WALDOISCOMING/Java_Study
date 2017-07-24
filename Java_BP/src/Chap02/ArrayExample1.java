package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * 1차원 배열의 사용 예를 보여주는 프로그램
 * 예제 2-16
 */
public class ArrayExample1 {
	public static void main(String[] args){
		int arr[];
		arr = new int[10];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = arr[0]+arr[1];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
