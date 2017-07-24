package Chap14;
import java.io.*;
/*
 * 작성일자:2017_03_17
 * 작성자:길경완
 * arraycopy 메소드의 사용 예를 보여주는 프로그램(2)
 * 예제 14-10
 */
public class SystemExample10 {
	public static void main(String[] args){
		int arr[]={0,1,2,3,4,5,6,7,8,9,10};
		System.arraycopy(arr,0,arr,3,5);
		for(int num:arr){
			System.out.println(num);
		}
	}
}
