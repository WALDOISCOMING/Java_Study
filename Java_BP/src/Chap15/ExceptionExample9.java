package Chap15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * �ۼ�����:2017_03_17
 * �ۼ���:����
 * ��� ���迡 �ִ� �� ������ �ͼ����� �ʸ��ϴ� try���� ��
 * ���� 15-7
 */
public class ExceptionExample9 {
	public static void main(String[] args){
	
		try{
			FileReader reader = new FileReader("some.txt");
			reader.close();
			
		}catch(FileNotFoundException e){
			System.err.println("���� ���� ����");
		}catch(IOException e){
			System.err.println("���� ����� ����");
		}
	}
	
}
