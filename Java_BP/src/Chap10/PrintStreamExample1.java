package Chap10;

import java.io.*;
import java.util.*;
/*
 * �ۼ�����:2017_03_14
 * �ۼ���:����
 * PrintStream Ŭ������ ��� ��
 * ���� 10-15
 */
public class PrintStreamExample1{
	public static void main(String[] args){

		System.out.println("------����ǥ------");
		System.out.printf("%3s :%3d %3d %3d %4.1f %n","������",92,87,95,91.3f);
		System.out.printf("%3s :%3d %3d %3d %4.1f %n","������",100,90,88,92.7f);
		System.out.printf("%3s :%3d %3d %3d %4.1f %n","�ֹ���",75,88,85,82.7f);
		System.out.printf("�ۼ�����: %1$tY�� %1$tm�� %1$td��",new GregorianCalendar());
		
	}
}

