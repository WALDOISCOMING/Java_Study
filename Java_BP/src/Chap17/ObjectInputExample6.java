package Chap17;

import java.io.*;

/*
 * �ۼ�����:2017_03_19
 * �ۼ���:����
 * BookInfo Ŭ������ ��ü�� ����ȭ�ϰ� ������ȭ �ϴ� ���α׷�
 * ���� 17-13
 */
public class ObjectInputExample6 {
	public static void main(String[] args){
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream(
					new FileInputStream("src/Chap17/output6.dat"));
			BookInfo obj = (BookInfo)in.readObject();
			System.out.println(obj.code);
			System.out.println(obj.name);
			System.out.println(obj.price);
			System.out.println(obj.writer);
			System.out.println(obj.page);
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
