package Chap13;
import java.util.*;
/*
 * �ۼ�����:2017_03_16
 * �ۼ���:����
 * LinkedList Ŭ������  ť�� ��� �ϴ� �� ��.
 * ���� 13-8
 */
public class QueueExample1 {
	public static void main(String[] args){
		LinkedList<String> que = new LinkedList<String>();
		que.offer("�䳢");
		que.offer("�罿");
		que.offer("ȣ����");
		while(!que.isEmpty()){
			String str = que.poll();
			System.out.println(str);
		
		}
		
	}
}
