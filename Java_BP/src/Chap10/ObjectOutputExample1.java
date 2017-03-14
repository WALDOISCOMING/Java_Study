package Chap10;

import java.io.*;
import java.util.GregorianCalendar;

/*
 * 작성일자:2017_03_14
 * 작성자:길경완
 * ObjectOutputStream 클래스를 이용하여 객체를 파일에 저장하는 예
 * 예제 10-9
 */
public class ObjectOutputExample1{
	public static void main(String[] args){
		ObjectOutputStream out = null;
		
		try{
			out = new ObjectOutputStream(
					new FileOutputStream("src/Chap10/output2.dat"));
			out.writeObject(new GregorianCalendar(2017,2,14));
			out.writeObject(new GregorianCalendar(2017,2,15));
			out.writeObject(new GregorianCalendar(2017,2,16));
			
		}
		catch(IOException e){
			System.out.println(e+"파일로 출력할 수 없습니다,.");
		}finally{
			try{
				out.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
		
	}
}

