package Chap10;

import java.io.*;

/*
 * 작성일자:2017_03_14
 * 작성자:길경완
 * FileOutputStream 클래스를 이용해서 바이트 데이터를 파일에 쓰는 프로그램
 * 예제 10-5
 */
public class OutputStreamExample1 {
	public static void main(String[] args){
		/*try-catch가 없어 오류남
		 */ 

		FileOutputStream out = null;
		try{
			out = new FileOutputStream("src/Chap10/output.dat");
			byte arr[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
			
			for(int cnt=0;cnt<arr.length;cnt++)
				out.write(arr[cnt]);
		
		}catch(IOException e){
			System.err.println(e+"파일로 출력 불가능");
		}finally{
			try{
				out.close();
			}catch(Exception e){
				System.err.println(e);
			}
		}
	}
}
