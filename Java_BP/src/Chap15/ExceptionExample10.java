package Chap15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * �ۼ�����:2017_03_17
 * �ۼ���:����
 * catch ���� ������������ try���� ��
 * ���� 15-8
 */
public class ExceptionExample10 {
	public static void main(String[] args){
	
		try{
			FileReader reader = new FileReader("some.txt");
			reader.close();
			
		}catch(IOException e){
			System.err.println("���� ����� ����");
		}
		/*err �߻�
		 * catch(FileNotFoundException e){
		System.err.println("���� ���� ����");
		}*/
	}
	
}
