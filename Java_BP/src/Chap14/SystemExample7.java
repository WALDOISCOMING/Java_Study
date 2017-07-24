package Chap14;
import java.io.*;
/*
 * �ۼ�����:2017_03_17
 * �ۼ���:����
 * exit �޼ҵ��� ��� ���� �����ִ� ���α׷�
 * ���� 14-7
 */
public class SystemExample7 {
	public static void main(String[] args){
		if(args.length!=2){
			System.out.println("Usage:java SystemExample7 <����> <����>");
			System.exit(1);
		}
		try{
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int sum = num1+num2;
			System.out.println(sum);
			System.exit(0);
		}catch(NumberFormatException e){
			System.err.println("�߸��� ����"+e);
			System.exit(-1);
		}
	}
}
