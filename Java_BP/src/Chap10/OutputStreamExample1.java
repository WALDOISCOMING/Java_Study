package Chap10;

import java.io.*;

/*
 * �ۼ�����:2017_03_14
 * �ۼ���:����
 * FileOutputStream Ŭ������ �̿��ؼ� ����Ʈ �����͸� ���Ͽ� ���� ���α׷�
 * ���� 10-5
 */
public class OutputStreamExample1 {
	public static void main(String[] args){
		/*try-catch�� ���� ������
		 */ 

		FileOutputStream out = null;
		try{
			out = new FileOutputStream("src/Chap10/output.dat");
			byte arr[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
			
			for(int cnt=0;cnt<arr.length;cnt++)
				out.write(arr[cnt]);
		
		}catch(IOException e){
			System.err.println(e+"���Ϸ� ��� �Ұ���");
		}finally{
			try{
				out.close();
			}catch(Exception e){
				System.err.println(e);
			}
		}
	}
}
