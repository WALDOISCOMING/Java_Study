package Chap10;

import java.io.*;
import java.util.*;
/*
 * 작성일자:2017_03_14
 * 작성자:길경완
 * 현재 디렉토리의 서브 디렉토리와 파일 목록을 출력하는 프로그램
 * 예제 10-16
 */
public class FileExample1{
	public static void main(String[] args){
		File file = new File(".");
		File arr[] = file.listFiles();
		for(int  cnt=0;cnt<arr.length;cnt++){
			String name=arr[cnt].getName();
			if(arr[cnt].isFile())
				System.out.printf("%-25s %7d",name,arr[cnt].length());
			else
				System.out.printf("%-25s <DIR>",name);
			
		long time = arr[cnt].lastModified();
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTimeInMillis(time);
		System.out.printf("%1$tF %1$tT %n",cal);
		}
	}
}

