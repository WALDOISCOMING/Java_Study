package Chap10;

import java.io.*;
import java.util.GregorianCalendar;

/*
 * �ۼ�����:2017_03_14
 * �ۼ���:����
 * ObjectOutputStream Ŭ������ �̿��Ͽ� ��ü�� ���Ͽ� �����ϴ� ��
 * ���� 10-9
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
			System.out.println(e+"���Ϸ� ����� �� �����ϴ�,.");
		}finally{
			try{
				out.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
		
	}
}

