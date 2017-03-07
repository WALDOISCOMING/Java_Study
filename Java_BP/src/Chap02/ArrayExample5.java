package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * 배열의 갯수를 출력하는 프로그램
 * 예제 2-20
 */
public class ArrayExample5 {
	public static void main(String[] args){
		int arr[] ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println(arr.length);
		System.out.println("반환값은!"+ArrayLength(arr));
		
		
	}
	
	static int ArrayLength(int arr[]){
		int i=0;
		for(int value : arr){
			System.out.println(i+"index의 "+value+"값!");
			i++;
		}
		
		return i;
	}
}
