package Chap18;
/*
 * �ۼ�����:2017_03_20
 * �ۼ���:����
 * ���� ��ü�� �ܾ� �հ踦 ����� ���ÿ� �ϴ� ���� ������ ���α׷�(2)
 * ���� 18-14 
 * ���� 18-15: ���� ��ü�� �ܾ� �հ� ����� ���ÿ� �ϴ� ��Ƽ������ ���α׷�(3
 */
public class MultithreadExample6 {
	public static void main(String[] args){
		SharedArea area = new SharedArea();
		area.account1 = new Account("111-111-1111","�̸���",20000000);
		area.account2 = new Account("222-222-2222","������",10000000);
		TransferThread thread1 = new TransferThread(area);
		printThread thread2 = new printThread(area);
		thread1.start();
		thread2.start();
	}
}
