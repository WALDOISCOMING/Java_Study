package Chap13;
import java.util.*;
/*
 * �ۼ�����:2017_03_16
 * �ۼ���:����
 * ArrayList�� �����͸� �˻��ϴ� ��
 * ���� 13-3
 */
public class ArrayListExample3 {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		list.add("����");
		list.add("���");
		list.add("�޵�");
		list.add("�ڵ�");
		list.add("���");
		int index1 = list.indexOf("���");
		int index2 = list.indexOf("���");
		int index3 = list.lastIndexOf("���");
		int num = list.size();
		System.out.println(index1);
		System.out.println(index2);
		System.out.println(index3);
	}
}
