package Chap18;
/*
 * �ۼ�����:2017_03_19
 * �ۼ���:����
 * �������� ����ؼ� ����ϴ� ��Ƽ������ ���α׷�(�̿ϼ�)
 * ���� 18-9
 * ���� 18-10: �������� ��� �ؼ� ����ϴ� ��Ƽ������ ���α׷�(�ϼ�)
 */
public class MultithreadExample4 {
	public static void main(String[] args){
		CalcThread thread1 = new CalcThread();
		printThread thread2 = new printThread();
		SharedArea obj = new SharedArea();
		thread1.sharedArea = obj;
		thread2.sharedArea = obj;
		thread1.start();
		thread2.start();
	}
}
