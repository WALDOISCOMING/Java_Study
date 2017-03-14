package Chap10;

import java.io.*;
import java.util.*;
/*
 * �ۼ�����:2017_03_14
 * �ۼ���:����
 * �ӽ� ������ �����ؼ� ����ϴ� ���α׷�
 * ���� 10-17
 */
public class FileExample2{
	public static void main(String[] args){
		FileWriter writer = null;
		try{
			String str = "C:/JAVA_SRC/git/Java_Study/Java_BP/src/Chap10";
			File file = File.createTempFile("tmp",".txt",
					new File(str));
			writer = new FileWriter(file);
			writer.write("�ڹ�");

		}catch(IOException e){
			System.out.println(e+"�ӽ� ���Ͽ� �� �� �����ϴ�.");
		}finally{
			try{
				writer.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
	}
}

