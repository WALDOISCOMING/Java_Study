package Chap14;
import java.io.*;
/*
 * �ۼ�����:2017_03_17
 * �ۼ���:����
 * Ű����κ��� ���ڸ� �Է¹޴� ���α׷�(2)
 * ���� 14-2
 */
public class SystemExample2 {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String str =reader.readLine();
			System.out.println(str);
			
		}catch(IOException e){
			System.out.println(e+"Ű���� input err");
		}
	}
}

