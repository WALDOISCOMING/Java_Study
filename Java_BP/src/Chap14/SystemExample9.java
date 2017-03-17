package Chap14;
import java.io.*;
/*
 * 작성일자:2017_03_17
 * 작성자:길경완
 * arraycopy 메소드의 사용 예를 보여주는 프로그램(1)
 * 예제 14-9
 */
public class SystemExample9 {
	public static void main(String[] args){
		char arr1[] = {'가','나','다','라','마','바','사','자','차','카','타','파','하'};
		char arr2[] = {'a','b','c','d','e','f','g','h','i','j','k'};
		System.arraycopy(arr1,10,arr2,2,3);
		for(char ch:arr2){
			System.out.println(ch);
		}
	}
}
