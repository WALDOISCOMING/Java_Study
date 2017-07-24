package Chap10;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * 작성일자:2017_03_14
 * 작성자:길경완
 * ObjectInputStream 클래스를 이용하여 객체를 파일에 저장하는 예
 * 예제 10-10
 */
public class ObjectInputExample1{
	public static void main(String[] args){
		
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream(
					new FileInputStream("src/Chap10/output2.dat"));
			while(true){
				GregorianCalendar cal = (GregorianCalendar) in.readObject();
				int year = cal.get(Calendar.YEAR);
				int month = cal.get(Calendar.MONTH)+1;
				int date= cal.get(Calendar.DATE);
				System.out.println(year+"/"+month+"/"+date);
				
			}
		
			
		}
		catch(FileNotFoundException e){
			System.out.println(e+"파일을 찾을수 없습니다.");
		}catch(EOFException e){
			System.out.println(e+"종료!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try{
				in.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
		
	}
}

