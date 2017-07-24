package Chap10;

import java.io.*;

/*
 * 작성일자:2017_03_14
 * 작성자:길경완
 * DataOutputStream 클래스 사용 예를 보여주는 프로그램
 * 예제 10-7
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
			System.out.println(e+"파일로 출력할 수 없습니다,.");
		}finally{
			try{
				out.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
		
	}
}

