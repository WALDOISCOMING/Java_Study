package Chap14;
import java.io.*;
/*
 * �ۼ�����:2017_03_17
 * �ۼ���:����
 * path ȯ�� ������ ���� �о���� ���α׷�
 * ���� 14-4
 */
public class SystemExample4 {
	public static void main(String[] args){
		String str = System.getenv("path");
		System.out.println(str);
	}
}
