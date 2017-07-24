package Chap17;

import java.io.*;

/*
 * �ۼ�����:2017_03_19
 * �ۼ���:����
 * BookInfo Ŭ������ ��ü�� ����ȭ�ϰ� ������ȭ �ϴ� ���α׷�
 * ���� 17-13
 */


public class ObjectOutputExample6 {
	public static void main(String[] args){
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(
					new FileOutputStream("src/Chap17/output6.dat"));
			
			
			BookInfo obj = new BookInfo("80801","������ ����",20000,"��Ų",636);
			System.out.println(obj.code);
			System.out.println(obj.name);
			System.out.println(obj.price);
			System.out.println(obj.writer);
			System.out.println(obj.page);

			out.writeObject(obj);
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
