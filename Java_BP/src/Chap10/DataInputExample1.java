package Chap10;

import java.io.*;

/*
 * �ۼ�����:2017_03_14
 * �ۼ���:����
 * DataInputStream Ŭ���� ��� ���� �����ִ� ���α׷�
 * ���� 10-8
 */
public class DataInputExample1{
	public static void main(String[] args){
		DataInputStream in = null;
		
		try{
			in = new DataInputStream(
					new FileInputStream("src/Chap10/output.dat"));
			while(true){
				int  data = in.readInt();
				System.out.println(data);
			}
		}
		catch(EOFException e){
			System.out.println(e+"��.");
		}
		catch(IOException e){
			System.out.println(e+"���Ϸ� ���� �� �����ϴ�,.");
		}finally{
			try{
				in.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
		
	}
}

