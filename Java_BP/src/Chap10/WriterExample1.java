package Chap10;

import java.io.*;

/*
 * 작성일자:2017_03_14
 * 작성자:길경완
 * FileWriter 클래스를 이용해서 ㅜㄴ자 데이터를 파일에 쓰는 포그램
 * 예제 10-4
 * 예제 10-12: BufferdWriter클래스를 이용하여 데이터 출력 성능을 향상시킨 프로그램
 */
public class WriterExample1 {
	public static void main(String[] args){
		
		BufferedWriter writer = null;
		try{
			writer = new BufferedWriter(
					new FileWriter("src/Chap10/output.txt"));
			char arr[]={
					'뇌','를',' ','자','극','하','는',' ','J','a','v','a'
			};
			for(int cnt=0;cnt<arr.length;cnt++)
				writer.write(arr[cnt]);
		}
		catch(IOException e){
			System.err.println(e+"파일로 출력 불가.");
		}finally{
			try{
				writer.close();
			}catch(Exception e){
				System.err.println(e);
			}
		}
	}
}
