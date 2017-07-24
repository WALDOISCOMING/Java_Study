package Chap10;

import java.io.*;

/*
 * 작성일자:2017_03_14
 * 작성자:길경완
 * DataInputStream 클래스 사용 예를 보여주는 프로그램
 * 예제 10-8
 */
public class DataInputExample1{
	public static void main(String[] args){
		DataInputStream in = null;
		
		try{
			in = new DataInputStream(
					new FileInputStream("src/Chap10/output.dat"));
			while(true){
				int  data = in.readInt();
				System.out.println(data);
			}
		}
		catch(EOFException e){
			System.out.println(e+"끝.");
		}
		catch(IOException e){
			System.out.println(e+"파일로 읽을 수 없습니다,.");
		}finally{
			try{
				in.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
		
	}
}

