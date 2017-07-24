package Chap17;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * �ۼ�����:2017_03_18
 * �ۼ���:����
 * ��ü�� ����ȭ �ϴ� ���α׷��� ������ȭ �ϴ� ���α׷�
 * ���� 17-1
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
			System.out.println("���� ���� x"+e);
		}
		catch(EOFException e){
			System.out.println("��");
		}catch(IOException e){
			System.out.println("���� ������ x"+e);
		}catch(ClassNotFoundException e){
			System.out.println("Ŭ���� ���� x"+e);
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
