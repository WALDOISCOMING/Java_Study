package Chap13;
import java.util.*;
/*
 * �ۼ�����:2017_03_16
 * �ۼ���:����
 * Iterator
 * ���� 13-6
 */
public class LinkedListExample3 {
	public static void main(String[] args){
		LinkedList<String> list = new LinkedList<String>();
		list.add("����");
		list.add("���ξ���");
		list.add("�ٳ���");
		Iterator<String> interator = list.iterator();
		int num = list.size();
		while(interator.hasNext()){
			String str = interator.next();
			System.out.println(str);
			System.out.println(interator);
		}
		
	}
}
