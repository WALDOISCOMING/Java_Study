package Chap17;

import java.io.*;

/*
 * 작성일자:2017_03_19
 * 작성자:길경완
 * BookInfo 클래스의 객체를 직렬화하고 역직렬화 하는 프로그램
 * 예제 17-13
 */


public class ObjectOutputExample6 {
	public static void main(String[] args){
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(
					new FileOutputStream("src/Chap17/output6.dat"));
			
			
			BookInfo obj = new BookInfo("80801","반지의 제왕",20000,"톨킨",636);
			System.out.println(obj.code);
			System.out.println(obj.name);
			System.out.println(obj.price);
			System.out.println(obj.writer);
			System.out.println(obj.page);

			out.writeObject(obj);
		}catch(IOException e){
			System.out.println("파일로 출력 불가."+e);
		}finally{
			try{
				out.close();
			}catch(Exception e){
				System.err.println(e);
			}
		}
	}
	
	
}
