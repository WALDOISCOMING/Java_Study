package Chap17;

import java.io.*;

/*
 * 작성일자:2017_03_19
 * 작성자:길경완
 * BookInfo 클래스의 객체를 직렬화하고 역직렬화 하는 프로그램
 * 예제 17-13
 */
public class ObjectInputExample6 {
	public static void main(String[] args){
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream(
					new FileInputStream("src/Chap17/output6.dat"));
			BookInfo obj = (BookInfo)in.readObject();
			System.out.println(obj.code);
			System.out.println(obj.name);
			System.out.println(obj.price);
			System.out.println(obj.writer);
			System.out.println(obj.page);
		}catch(FileNotFoundException e){
			System.out.println("파일 존재 x"+e);
		}
		catch(EOFException e){
			System.out.println("끝");
		}catch(IOException e){
			System.out.println("파일 읽을수 x"+e);
		}catch(ClassNotFoundException e){
			System.out.println("클래스 존재 x"+e);
		}
		finally{
			try{
				in.close();
			}catch(Exception e){
				System.err.println(e);
			}
		}
	}
	
	
}
