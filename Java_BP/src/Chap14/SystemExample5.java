package Chap14;
import java.io.*;
import java.util.Properties;
/*
 * 작성일자:2017_03_17
 * 작성자:길경완
 * 시스템 프로퍼티를 모두 가져와서 출력하는 프로그램
 * 예제 14-5
 */
public class SystemExample5 {
	public static void main(String[] args){
		Properties pro = System.getProperties();
		pro.list(System.out);
	}
}
