package Chap17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

/*
 * 작성일자:2017_03_18
 * 작성자:길경완
 * 객체를 직렬화 하는 프로그램과 역직렬화 하는 프로그램
 * 예제 17-3
 */
public class ObjectOutputExample2 {
	public static void main(String[] args){
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(
					new FileOutputStream("src/Chap17/output2.dat"));
			out.writeObject(new GoodsStock("70101",100));
			out.writeObject(new GoodsStock("70102",50));
			out.writeObject(new GoodsStock("70103",200));
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
