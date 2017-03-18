package Chap17;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * 작성일자:2017_03_18
 * 작성자:길경완
 * 객체를 직렬화 하는 프로그램과 역직렬화 하는 프로그램
 * 예제 17-1
 */
public class ObjectInputExample1 {
	public static void main(String[] args){
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream(
					new FileInputStream("src/Chap17/output.dat"));
			while(true){
				GregorianCalendar cal = (GregorianCalendar)in.readObject();
				int year = cal.get(Calendar.YEAR);
				int month = cal.get(Calendar.MONTH)+1;
				int date = cal.get(Calendar.DATE);
				System.out.println(year+"."+month+"."+date);
			}
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
