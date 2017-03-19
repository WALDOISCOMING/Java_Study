package Chap17;

import java.io.*;

/*
 * �ۼ�����:2017_03_19
 * �ۼ���:����
 * Rectangle Ŭ������ ��ü�� ����ȭ�ϰ� ������ȭ �ϴ� ���α׷�
 * ���� 17-18
 */
public class ObjectInputExample7 {
	public static void main(String[] args){
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream(
					new FileInputStream("src/Chap17/output7.dat"));
			Retangle obj = (Retangle)in.readObject();
			System.out.println(obj.height);
			System.out.println(obj.width);
			
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
