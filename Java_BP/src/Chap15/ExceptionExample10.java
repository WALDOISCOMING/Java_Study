package Chap15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 작성일자:2017_03_17
 * 작성자:길경완
 * catch 절의 순서가졸못된 try문의 예
 * 예제 15-8
 */
public class ExceptionExample10 {
	public static void main(String[] args){
	
		try{
			FileReader reader = new FileReader("some.txt");
			reader.close();
			
		}catch(IOException e){
			System.err.println("ㅎㅎ 입출력 오류");
		}
		/*err 발생
		 * catch(FileNotFoundException e){
		System.err.println("ㅎㅎ 파일 없음");
		}*/
	}
	
}
