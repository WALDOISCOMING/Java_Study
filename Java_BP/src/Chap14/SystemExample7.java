package Chap14;
import java.io.*;
/*
 * 작성일자:2017_03_17
 * 작성자:길경완
 * exit 메소드의 사용 예를 보여주는 프로그램
 * 예제 14-7
 */
public class SystemExample7 {
	public static void main(String[] args){
		if(args.length!=2){
			System.out.println("Usage:java SystemExample7 <정수> <정수>");
			System.exit(1);
		}
		try{
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int sum = num1+num2;
			System.out.println(sum);
			System.exit(0);
		}catch(NumberFormatException e){
			System.err.println("잘못된 숫자"+e);
			System.exit(-1);
		}
	}
}
