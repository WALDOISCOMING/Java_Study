package Chap10;

import java.io.*;

/*
 * 작성일자:2017_03_14
 * 작성자:길경완
 * 텍스트 파일에 행 번호를 붙이면서 읽는 프로그램
 * 예제 10-13
 */
public class LineNumberExample1{
	public static void main(String[] args){
		LineNumberReader reader = null;
		try{
			reader = new LineNumberReader(
					new FileReader("src/Chap10/poem.txt"));
			while(true){
				String str = reader.readLine();
				if(str==null)
					break;
				int lineNo = reader.getLineNumber();
				System.out.println(lineNo+": "+str);
			}
		}catch(FileNotFoundException e){
			System.out.println(e+"파일 존재 X");
		}catch(IOException e){
			System.out.println(e+"파일 읽을수 없다.");
		}finally{
			try{
				reader.close();
			}catch(Exception e){
				System.out.println(e);
			}
			
		}
		
		
	}
}

