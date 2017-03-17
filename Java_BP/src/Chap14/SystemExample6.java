package Chap14;
import java.io.*;
/*
 * 작성일자:2017_03_17
 * 작성자:길경완
 * 특정 시스템 프로퍼티 값을 가져와서 출력하는 프로그램
 * 예제 14-6
 */
public class SystemExample6 {
	public static void main(String[] args){
		String str = System.getProperty("user.dir");
		System.out.println(str);
	}
}
