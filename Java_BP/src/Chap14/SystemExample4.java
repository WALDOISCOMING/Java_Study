package Chap14;
import java.io.*;
/*
 * 작성일자:2017_03_17
 * 작성자:길경완
 * path 환경 변수의 값을 읽어오는 프로그램
 * 예제 14-4
 */
public class SystemExample4 {
	public static void main(String[] args){
		String str = System.getenv("path");
		System.out.println(str);
	}
}
