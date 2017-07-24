package Chap10;

import java.io.*;

/*
 * �ۼ�����:2017_03_14
 * �ۼ���:����
 * �ؽ�Ʈ ������ �д� ���α׷�-�̿ϼ�
 * ���� 10-1
 * ���� 10-2: �ؽ�Ʈ ������ �д� ���α׷�-�̿ϼ�2
 * ���� 10-2: �ؽ�Ʈ ������ �д� ���α׷�-�ϼ�
 */
public class ReaderExample1 {
	public static void main(String[] args){
		/*try-catch�� ���� ������
		 */ 

		FileReader reader = null;
		try{
			reader = new FileReader("src/Chap10/poem.txt");
			while(true){
			int data = reader.read();
			if(data==-1)
				break;
			char ch = (char)data;
			System.out.print(ch);
		}
		}catch(FileNotFoundException e){
			System.err.println(e+"���� ���� x");
		}catch(IOException e){
			System.err.println(e+"���� �������� ����");
		}finally{
			try{
				reader.close();
			}catch(Exception e){
				System.err.println(e);
			}
		}
	}
}
