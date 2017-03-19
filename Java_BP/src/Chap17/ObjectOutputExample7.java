package Chap17;

import java.io.*;

/*
 * 작성일자:2017_03_19
 * 작성자:길경완
 * Rectangle 클래스의 객체를 직렬화하고 역직렬화 하는 프로그램
 * 예제 17-18
 */


public class ObjectOutputExample7 {
	public static void main(String[] args){
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(
					new FileOutputStream("src/Chap17/output7.dat"));
			
			Retangle obj = new Retangle(100,200);
			System.out.println(obj.width+"."+obj.height);
		

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
