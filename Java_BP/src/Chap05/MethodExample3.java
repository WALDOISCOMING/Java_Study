package Chap05;

/*
 * 작성일자:2017_03_09
 * 작성자:길경완
 * numbers 익셉션 발생
 * 예제 5-26
 */
public class MethodExample3 {
	public static void main(String[] args){
		int arr[] = new int[0];
		Numbers obj = new Numbers(arr);
		int total = obj.getTotal();
		int avg = obj.getAverage();//err 발생
		System.out.println(total);
		System.out.println(avg);
	}
}
