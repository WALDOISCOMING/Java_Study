package Chap17;

import java.io.*;

/*
 * �ۼ�����:2017_03_19
 * �ۼ���:����
 * ��ü�� ����ȭ �ϴ� ���α׷��� ������ȭ �ϴ� ���α׷�
 * ���� 17-3
 */
public class ObjectInputExample2 {
	public static void main(String[] args){
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream(
					new FileInputStream("src/Chap17/output2.dat"));
			while(true){
				GoodsStock obj  = (GoodsStock)in.readObject();
				System.out.println("��ǰ�ڵ�:"+obj.code+"\t��ǰ����:"+obj.num);
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
