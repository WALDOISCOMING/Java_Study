package Chap10;

import java.io.*;

/*
 * 작성일자:2017_03_14
 * 작성자:길경완
 * 파일의 내용을 읽어서 16진수로 출력하는 프로그램
 * 예제 10-6
 * 예제 10-11: BufferdInputStream 클래스를 이용하ㅣ여 성능을 향상시킨 FileDump 프로그램
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
			System.out.println(args[0]+"파일 존재 x");
		}catch(IOException e){
			System.out.println(args[0]+"파일 읽을수 없다.");
		}finally{
			try{
				in.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
		
	}
}

