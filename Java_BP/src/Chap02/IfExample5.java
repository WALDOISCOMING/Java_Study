package Chap02;

/*
 * �ۼ�����:2017_03_07
 * �ۼ���:����
 * �ڹ��� dangling else ��Ģ�� �� Ȱ���� ���α׷�
 * ���� 2-26
 */
public class IfExample5 {
	public static void main(String[] args){
		int num = 74;
		if(num<10)
			System.out.println("num�� ���� 10 �̸��Դϴ�.");
		else if(num<100)
			System.out.println("num�� 10 �̻� 100 �̸��Դϴ�.");
		else if(num<1000)
			System.out.println("num�� 100�̻� 1000�̸��Դϴ�.");
		else
			System.out.println("num�� ���� 1000�̻��Դϴ�.");
	}
}
