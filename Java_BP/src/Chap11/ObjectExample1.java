package Chap11;

import java.io.File;

/*
 * �ۼ�����:2017_03_15
 * �ۼ���:����
 * toString �޼ҵ��� ��� ���� �����ִ� ���α׷�(1)
 * ���� 11-1
 */
public class ObjectExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("src/Chap11/���ٱ�.txt");
		String str = file.toString();
		System.out.println(str);
	}

}
