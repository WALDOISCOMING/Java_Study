package Chap10;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * �ۼ�����:2017_03_14
 * �ۼ���:����
 * ObjectInputStream Ŭ������ �̿��Ͽ� ��ü�� ���Ͽ� �����ϴ� ��
 * ���� 10-10
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
			System.out.println(e+"������ ã���� �����ϴ�.");
		}catch(EOFException e){
			System.out.println(e+"����!");
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

