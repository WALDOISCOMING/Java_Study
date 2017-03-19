package Chap17;

import java.io.*;

/*
 * �ۼ�����:2017_03_19
 * �ۼ���:����
 * Rectangle Ŭ������ ��ü�� ����ȭ�ϰ� ������ȭ �ϴ� ���α׷�
 * ���� 17-18
 */


public class ObjectOutputExample7 {
	public static void main(String[] args){
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(
					new FileOutputStream("src/Chap17/output7.dat"));
			
			Retangle obj = new Retangle(100,200);
			System.out.println(obj.width+"."+obj.height);
		

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
