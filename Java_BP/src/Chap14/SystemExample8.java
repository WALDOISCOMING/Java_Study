package Chap14;
import java.io.*;
/*
 * 작성일자:2017_03_17
 * 작성자:길경완
 * gc 메소드의 사용 예를 보여주는 프로그램
 * 예제 14-8
 */
public class SystemExample8 {
	public static void main(String[] args){
		ResourceUser obj = new ResourceUser();
		obj.use();
		obj = null;
		System.gc();
	}
}
