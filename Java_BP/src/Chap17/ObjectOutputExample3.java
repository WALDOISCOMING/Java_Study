package Chap17;

import java.io.*;

/*
 * �ۼ�����:2017_03_19
 * �ۼ���:����
 * BBSItem Ŭ������ ��ü�� ����ȭ �ϰ� ������ȭ �ϴ� ���α׷�
 * ���� 17-5
 */


public class ObjectOutputExample3 {
	public static void main(String[] args){
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(
					new FileOutputStream("src/Chap17/output3.dat"));
			BBSItem obj = new BBSItem("�ּ���","sunshine","����.","�̹��� �� ����?");
			System.out.println(obj.itemNum);
			System.out.println(obj.writer);
			System.out.println(obj.passwd);
			System.out.println(obj.title);
			System.out.println(obj.content);
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
