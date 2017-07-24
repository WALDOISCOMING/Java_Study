package Chap17;

import java.io.*;

/*
 * �ۼ�����:2017_03_19
 * �ۼ���:����
 * �Խù� Ŭ������ ��ü�� ����ȭ �ϰ� ������ȭ �ϴ� ���α׷�.
 * ���� 17-7
 */
public class ObjectInputExample4 {
	public static void main(String[] args){
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream(
					new FileInputStream("src/Chap17/output4.dat"));
			while(true){
				BBSItem obj  = (BBSItem)in.readObject();
				System.out.println(obj.itemNum);
				System.out.println(obj.writer);
				System.out.println(obj.passwd);
				System.out.println(obj.title);
				System.out.println(obj.content);
				System.out.println(obj.attachment);
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
