package Chap17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

/*
 * �ۼ�����:2017_03_18
 * �ۼ���:����
 * ��ü�� ����ȭ �ϴ� ���α׷��� ������ȭ �ϴ� ���α׷�
 * ���� 17-1
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
			System.out.println("���Ϸ� ��� �Ұ�."+e);
		}finally{
			try{
				out.close();
			}catch(Exception e){
				System.err.println(e);
			}
		}
	}
	
	
}
