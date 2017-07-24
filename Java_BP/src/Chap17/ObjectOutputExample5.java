package Chap17;

import java.io.*;

/*
 * �ۼ�����:2017_03_19
 * �ۼ���:����
 * DistrChart Ŭ������ ��ü�� ����ȭ�ϰ� ������ȭ �ϴ� ���α׷�
 * ���� 17-10
 */


public class ObjectOutputExample5 {
	public static void main(String[] args){
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(
					new FileOutputStream("src/Chap17/output5.dat"));
			DistrChart obj = new DistrChart();
			obj.arr[0][1] =2;
			obj.arr[4][5] =5;
			obj.arr[6][1] =2;
			obj.arr[7][7] =7;
			obj.arr[8][4] =21;

			out.writeObject(obj);
		}catch(IOException e){
			System.out.println("���Ϸ� ��� �Ұ�."+e);
		}finally{
			try{
				out.close();
			}catch(Exception e){
				System.err.println(e);
			}
		}
	}
	
	
}
