package Chap05;

/*
 * 작성일자:2017_03_09
 * 작성자:길경완
 * Numbers 이용
 * 예제 5-25
 */
public class MethodExample2 {
	public static void main(String[] args){
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		Numbers obj = new Numbers(arr);
		int total = obj.getTotal();
		int avg = obj.getAverage();
		System.out.println(total);
		System.out.println(avg);
	}
}
