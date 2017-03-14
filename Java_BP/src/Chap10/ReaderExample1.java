package Chap10;

import java.io.*;

/*
 * 작성일자:2017_03_14
 * 작성자:길경완
 * 텍스트 파일을 읽는 프로그램-미완성
 * 예제 10-1
 * 예제 10-2: 텍스트 파일을 읽는 프로그램-미완성2
 * 예제 10-2: 텍스트 파일을 읽는 프로그램-완성
 */
public class ReaderExample1 {
	public static void main(String[] args){
		/*try-catch가 없어 오류남
		 */ 

		FileReader reader = null;
		try{
			reader = new FileReader("src/Chap10/poem.txt");
			while(true){
			int data = reader.read();
			if(data==-1)
				break;
			char ch = (char)data;
			System.out.print(ch);
		}
		}catch(FileNotFoundException e){
			System.err.println(e+"파일 존재 x");
		}catch(IOException e){
			System.err.println(e+"파일 읽을수가 없다");
		}finally{
			try{
				reader.close();
			}catch(Exception e){
				System.err.println(e);
			}
		}
	}
}
