package Chap14;
import java.io.*;
import java.util.Properties;
/*
 * �ۼ�����:2017_03_17
 * �ۼ���:����
 * �ý��� ������Ƽ�� ��� �����ͼ� ����ϴ� ���α׷�
 * ���� 14-5
 */
public class SystemExample5 {
	public static void main(String[] args){
		Properties pro = System.getProperties();
		pro.list(System.out);
	}
}
