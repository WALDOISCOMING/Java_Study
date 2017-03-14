package Chap10;

import java.io.*;

/*
 * �ۼ�����:2017_03_14
 * �ۼ���:����
 * �ؽ�Ʈ ���Ͽ� �� ��ȣ�� ���̸鼭 �д� ���α׷�
 * ���� 10-13
 */
public class LineNumberExample1{
	public static void main(String[] args){
		LineNumberReader reader = null;
		try{
			reader = new LineNumberReader(
					new FileReader("src/Chap10/poem.txt"));
			while(true){
				String str = reader.readLine();
				if(str==null)
					break;
				int lineNo = reader.getLineNumber();
				System.out.println(lineNo+": "+str);
			}
		}catch(FileNotFoundException e){
			System.out.println(e+"���� ���� X");
		}catch(IOException e){
			System.out.println(e+"���� ������ ����.");
		}finally{
			try{
				reader.close();
			}catch(Exception e){
				System.out.println(e);
			}
			
		}
		
		
	}
}

