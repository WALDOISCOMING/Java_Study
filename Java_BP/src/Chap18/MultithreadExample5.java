package Chap18;
/*
 * �ۼ�����:2017_03_19
 * �ۼ���:����
 * ���� ��ü�� �ܾ� �հ� ����� ���ÿ� �ϴ� ��Ƽ������ ���α׷�(�̿ϼ�)
 * ���� 18-12
 */
public class MultithreadExample5 {
	public static void main(String[] args){
		SharedArea area = new SharedArea();
		area.account1 = new Account("111-111-1111","�̸���",2000000);
		area.account2 = new Account("222-222-2222","������",1000000);
		TransferThread thread1 = new TransferThread(area);
		printThread thread2 = new printThread(area);
		thread1.start();
		thread2.start();
	}
}
