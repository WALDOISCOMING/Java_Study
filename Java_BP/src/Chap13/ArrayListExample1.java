package Chap13;
import java.util.*;
/*
 * �ۼ�����:2017_03_16
 * �ۼ���:����
 * ArrayList Ŭ������ ��� ���� �����ִ� ���α׷�
 * ���� 13-1
 */
public class ArrayListExample1 {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("������");
		int num = list.size();
		for(int cnt=0;cnt<num;cnt++){
			String str = list.get(cnt);
			System.out.println(str);
		}
	}
}
