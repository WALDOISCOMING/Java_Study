package Chap10;

import java.io.*;

/*
 * �ۼ�����:2017_03_14
 * �ۼ���:����
 * DataOutputStream Ŭ���� ��� ���� �����ִ� ���α׷�
 * ���� 10-7
 */
public class DataOutputExample1{
	public static void main(String[] args){
		DataOutputStream out = null;
		try{
			out = new DataOutputStream(
					new FileOutputStream("src/Chap10/output.dat"));
			int arr[] = {1,2,3,4,5,6,7,8,9};
			for(int cnt=0;cnt<arr.length;cnt++)
				out.writeInt(arr[cnt]);
		}
		catch(IOException e){
			System.out.println(e+"���Ϸ� ����� �� �����ϴ�,.");
		}finally{
			try{
				out.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
		
	}
}

