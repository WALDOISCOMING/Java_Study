package Chap14;
import java.io.*;
/*
 * �ۼ�����:2017_03_17
 * �ۼ���:����
 * arraycopy �޼ҵ��� ��� ���� �����ִ� ���α׷�(1)
 * ���� 14-9
 */
public class SystemExample9 {
	public static void main(String[] args){
		char arr1[] = {'��','��','��','��','��','��','��','��','��','ī','Ÿ','��','��'};
		char arr2[] = {'a','b','c','d','e','f','g','h','i','j','k'};
		System.arraycopy(arr1,10,arr2,2,3);
		for(char ch:arr2){
			System.out.println(ch);
		}
	}
}
