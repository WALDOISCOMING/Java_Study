package Chap18;
/*
 * �ۼ�����:2017_03_20
 * �ۼ���:����
 * notifyall �޼ҵ��� ��� ���� �����ִ� ���α׷�
 * ���� 18-17
 */
public class MultithreadExample8 {
	public static void main(String[] args){
		SharedArea obj = new SharedArea();
		CalcThread thread1 = new CalcThread();
		printThread thread2 = new printThread();
		SimplePrintThread thread3 = new SimplePrintThread();
		LuxuryPrintThread thread4 = new LuxuryPrintThread();
		thread1.sharedArea = obj;
		thread2.sharedArea = obj;
		thread3.sharedArea = obj;
		thread4.sharedArea = obj;
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}
