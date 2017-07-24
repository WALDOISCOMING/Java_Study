package Chap10;

import java.io.*;

/*
 * �ۼ�����:2017_03_14
 * �ۼ���:����
 * FileWriter Ŭ������ �̿��ؼ� �̤��� �����͸� ���Ͽ� ���� ���׷�
 * ���� 10-4
 * ���� 10-12: BufferdWriterŬ������ �̿��Ͽ� ������ ��� ������ ����Ų ���α׷�
 */
public class WriterExample1 {
	public static void main(String[] args){
		
		BufferedWriter writer = null;
		try{
			writer = new BufferedWriter(
					new FileWriter("src/Chap10/output.txt"));
			char arr[]={
					'��','��',' ','��','��','��','��',' ','J','a','v','a'
			};
			for(int cnt=0;cnt<arr.length;cnt++)
				writer.write(arr[cnt]);
		}
		catch(IOException e){
			System.err.println(e+"���Ϸ� ��� �Ұ�.");
		}finally{
			try{
				writer.close();
			}catch(Exception e){
				System.err.println(e);
			}
		}
	}
}
