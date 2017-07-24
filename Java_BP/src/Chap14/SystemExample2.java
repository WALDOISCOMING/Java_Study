package Chap14;
import java.io.*;
/*
 * 작성일자:2017_03_17
 * 작성자:길경완
 * 키보드로부터 문자를 입력받는 프로그램(2)
 * 예제 14-2
 */
public class SystemExample2 {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String str =reader.readLine();
			System.out.println(str);
			
		}catch(IOException e){
			System.out.println(e+"키보드 input err");
		}
	}
}

