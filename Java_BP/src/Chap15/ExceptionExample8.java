package Chap15;

import java.io.FileReader;
import java.io.IOException;

/*
 * 작성일자:2017_03_17
 * 작성자:길경완
 * 익셉션 파라미터 변수의 다형성을 보여주는 프로그램
 * 예제 15-6
 */
public class ExceptionExample8 {
	public static void main(String[] args){
	
		try{
			FileReader reader = new FileReader("some.txt");
			reader.close();
			
		}catch(IOException e){
			System.err.println(e.getMessage());
		}
	}
	
}
