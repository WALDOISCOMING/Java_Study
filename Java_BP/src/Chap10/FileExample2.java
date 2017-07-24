package Chap10;

import java.io.*;
import java.util.*;
/*
 * 작성일자:2017_03_14
 * 작성자:길경완
 * 임시 파일을 생성해서 사용하는 프로그램
 * 예제 10-17
 */
public class FileExample2{
	public static void main(String[] args){
		FileWriter writer = null;
		try{
			String str = "C:/JAVA_SRC/git/Java_Study/Java_BP/src/Chap10";
			File file = File.createTempFile("tmp",".txt",
					new File(str));
			writer = new FileWriter(file);
			writer.write("자바");

		}catch(IOException e){
			System.out.println(e+"임시 파일에 쓸 수 없습니다.");
		}finally{
			try{
				writer.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
	}
}

