package Chap13;
import java.util.*;
/*
 * �ۼ�����:2017_03_16
 * �ۼ���:����
 * LinkedList�� �����͸� ����/����/�����ϴ� ��
 * ���� 13-5
 */
public class LinkedListExample2 {
	public static void main(String[] args){
		LinkedList<String> list = new LinkedList<String>();
		list.add("����");
		list.add("����");
		list.add("������");
		list.add(2,"Ű��");
		list.set(0, "������");
		int num = list.size();
		for(int cnt=0;cnt<num;cnt++){
			String str = list.get(cnt);
			System.out.println(str);
		}
		
	}
}
