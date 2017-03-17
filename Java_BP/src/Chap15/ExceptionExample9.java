package Chap15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 작성일자:2017_03_17
 * 작성자:길경완
 * 상속 관계에 있는 두 종류의 익셉션을 초리하는 try문의 예
 * 예제 15-7
 */
public class ExceptionExample9 {
	public static void main(String[] args){
	
		try{
			FileReader reader = new FileReader("some.txt");
			reader.close();
			
		}catch(FileNotFoundException e){
			System.err.println("ㅎㅎ 파일 없음");
		}catch(IOException e){
			System.err.println("ㅎㅎ 입출력 오류");
		}
	}
	
}
