package Chap13;
import java.util.*;
/*
 * �ۼ�����:2017_03_16
 * �ۼ���:����
 * hashcode �޼ҵ��� ��� ���� �����ִ� ���α׷�
 * ���� 13-10
 */
public class HashCodeExample1 {
	public static void main(String[] args){
		String obj1 = new String("�츣�̿´�");
		String obj2 = new String("�츣�̿´�");
		int hash1 = obj1.hashCode();
		int hash2 = obj2.hashCode();
		System.out.println(hash1);
		System.out.println(hash2);
		
	}
}
