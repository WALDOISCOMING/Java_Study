package Chap10;

import java.io.*;
import java.util.*;
/*
 * �ۼ�����:2017_03_14
 * �ۼ���:����
 * PrintWriter Ŭ������ ��� ��
 * ���� 10-14
 */
public class PrintWriterExample1{
	public static void main(String[] args){
		PrintWriter writer = null;
		try{
			writer = new PrintWriter("src/Chap10/output2.txt");
			writer.println("------����ǥ------");
			writer.printf("%3s :%3d %3d %3d %4.1f %n","������",92,87,95,91.3f);
			writer.printf("%3s :%3d %3d %3d %4.1f %n","������",100,90,88,92.7f);
			writer.printf("%3s :%3d %3d %3d %4.1f %n","�ֹ���",75,88,85,82.7f);
			writer.printf("�ۼ�����: %1$tY�� %1$tm�� %1$td��",new GregorianCalendar());

		}catch(IOException e){
			System.out.println(e+"���Ϸ� ��� Ǯ����");
		}finally{
			try{
				writer.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
	}
}

