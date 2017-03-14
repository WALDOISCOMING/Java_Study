package Chap10;

import java.io.*;

/*
 * �ۼ�����:2017_03_14
 * �ۼ���:����
 * ������ ������ �о 16������ ����ϴ� ���α׷�
 * ���� 10-6
 * ���� 10-11: BufferdInputStream Ŭ������ �̿��Ϥӿ� ������ ����Ų FileDump ���α׷�
 */
public class FileDump{
	public static void main(String[] args){
		if(args.length<1){
			System.out.println("Usage: java FileDump <filename>");
			return;
		}
		
		BufferedInputStream in = null;
		try{
			in = new BufferedInputStream(
					new FileInputStream(args[0]));
			byte arr[] = new byte[16];
			while(true){
				int num = in.read(arr);
				if(num<0)
					break;
				for(int cnt=0;cnt<num;cnt++){
					System.out.printf("%02X ",arr[cnt]);
				}
				System.out.println();
			}
		}catch(FileNotFoundException e){
			System.out.println(args[0]+"���� ���� x");
		}catch(IOException e){
			System.out.println(args[0]+"���� ������ ����.");
		}finally{
			try{
				in.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
		
	}
}

