package Chap14;
import java.io.*;
/*
 * �ۼ�����:2017_03_17
 * �ۼ���:����
 * gc �޼ҵ��� ��� ���� �����ִ� ���α׷�
 * ���� 14-8
 */
public class SystemExample8 {
	public static void main(String[] args){
		ResourceUser obj = new ResourceUser();
		obj.use();
		obj = null;
		System.gc();
	}
}
