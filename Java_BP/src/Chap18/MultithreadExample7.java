package Chap18;
/*
 * �ۼ�����:2017_03_20
 * �ۼ���:����
 * notify �޼ҵ�� wait �޼ҵ��� ��� ���� �����ִ� ������ ��� ���α׷�
 * ���� 18-16
 */
public class MultithreadExample7 {
	public static void main(String[] args){
		SharedArea obj = new SharedArea();
		CalcThread thread1 = new CalcThread();
		printThread thread2 = new printThread();
		thread1.sharedArea = obj;
		thread2.sharedArea = obj;
		thread1.start();
		thread2.start();
	}
}
