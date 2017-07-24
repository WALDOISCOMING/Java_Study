package Chap14;
import java.io.*;
/*
 * 작성일자:2017_03_16
 * 작성자:길경완
 * 키보드로부터 문자를 입력받는 프로그램(1)
 * 예제 14-1
 */
public class SystemExample1 {
	public static void main(String[] args){
		InputStreamReader reader = new InputStreamReader(System.in);
		try{
			while(true){
				char ch = (char)reader.read();
				System.out.println("입력문자"+ch);
				if(ch=='.')
					break;
			}
			
		}catch(IOException e){
			System.out.println(e+"키보드 input err");
		}
	}
}
