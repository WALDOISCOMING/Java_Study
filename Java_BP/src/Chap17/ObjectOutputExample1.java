package Chap17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

/*
 * 작성일자:2017_03_18
 * 작성자:길경완
 * 객체를 직렬화 하는 프로그램과 역직렬화 하는 프로그램
 * 예제 17-1
 */
public class ObjectOutputExample1 {
	public static void main(String[] args){
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(
					new FileOutputStream("src/Chap17/output.dat"));
			out.writeObject(new GregorianCalendar(2017,2,18));
			out.writeObject(new GregorianCalendar(2017,2,19));
			out.writeObject(new GregorianCalendar(2017,2,20));
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
