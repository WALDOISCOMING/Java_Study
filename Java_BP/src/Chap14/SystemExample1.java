package Chap14;
import java.io.*;
/*
 * �ۼ�����:2017_03_16
 * �ۼ���:����
 * Ű����κ��� ���ڸ� �Է¹޴� ���α׷�(1)
 * ���� 14-1
 */
public class SystemExample1 {
	public static void main(String[] args){
		InputStreamReader reader = new InputStreamReader(System.in);
		try{
			while(true){
				char ch = (char)reader.read();
				System.out.println("�Է¹���"+ch);
				if(ch=='.')
					break;
			}
			
		}catch(IOException e){
			System.out.println(e+"Ű���� input err");
		}
	}
}
