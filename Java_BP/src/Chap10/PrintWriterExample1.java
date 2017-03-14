package Chap10;

import java.io.*;
import java.util.*;
/*
 * 작성일자:2017_03_14
 * 작성자:길경완
 * PrintWriter 클래스의 사용 예
 * 예제 10-14
 */
public class PrintWriterExample1{
	public static void main(String[] args){
		PrintWriter writer = null;
		try{
			writer = new PrintWriter("src/Chap10/output2.txt");
			writer.println("------성적표------");
			writer.printf("%3s :%3d %3d %3d %4.1f %n","김지영",92,87,95,91.3f);
			writer.printf("%3s :%3d %3d %3d %4.1f %n","박현식",100,90,88,92.7f);
			writer.printf("%3s :%3d %3d %3d %4.1f %n","최민재",75,88,85,82.7f);
			writer.printf("작성일자: %1$tY년 %1$tm월 %1$td일",new GregorianCalendar());

		}catch(IOException e){
			System.out.println(e+"파일로 출력 풀가능");
		}finally{
			try{
				writer.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
	}
}

