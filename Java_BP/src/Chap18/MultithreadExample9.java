package Chap18;
/*
 * �ۼ�����:2017_03_20
 * �ۼ���:����
 * ����͸� �����尡 �߰��� ������ ��� ���α׷���
 * ���� 18-18
 */
public class MultithreadExample9 {
	public static void main(String[] args){
		SharedArea obj = new SharedArea();
		CalcThread thread1 = new CalcThread();
		printThread thread2 = new printThread();
		MonitorThread thread3 = new MonitorThread(thread1);

		thread1.sharedArea = obj;
		thread2.sharedArea = obj;

		thread1.start();
		thread2.start();
		thread3.start();

	}
}
