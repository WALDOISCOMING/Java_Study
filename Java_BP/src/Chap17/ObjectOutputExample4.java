package Chap17;

import java.io.*;

/*
 * �ۼ�����:2017_03_19
 * �ۼ���:����
 * �Խù� Ŭ������ ��ü�� ����ȭ �ϰ� ������ȭ �ϴ� ���α׷�.
 * ���� 17-7
 */


public class ObjectOutputExample4 {
	public static void main(String[] args){
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(
					new FileOutputStream("src/Chap17/output4.dat"));
			BBSItem obj = new BBSItem("�̼���","moonlight","�ڷ�����","���� ÷�� ����.");
			obj.addAttachment(new Object());
			System.out.println(obj.itemNum);
			System.out.println(obj.writer);
			System.out.println(obj.passwd);
			System.out.println(obj.title);
			System.out.println(obj.content);
			System.out.println(obj.attachment);
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
