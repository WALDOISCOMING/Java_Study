package Chap15;

import java.io.FileReader;
import java.io.IOException;

/*
 * �ۼ�����:2017_03_17
 * �ۼ���:����
 * �ͼ��� �Ķ���� ������ �������� �����ִ� ���α׷�
 * ���� 15-6
 */
public class ExceptionExample8 {
	public static void main(String[] args){
	
		try{
			FileReader reader = new FileReader("some.txt");
			reader.close();
			
		}catch(IOException e){
			System.err.println(e.getMessage());
		}
	}
	
}
