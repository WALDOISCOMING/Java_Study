package Chap06;
/*
 * �ۼ�����:2017_03_12
 * �ۼ���:����
 * ���� ���� �������̽�
 * ���� 6-24
 * ���� 6-30: ��� �ʵ尡 �߰��� ���� ���� �������̽�
 * ���� 6-34: �߻� �޼ҵ忡 throws���� �߰��� ���� ��� �������̽�
 */
public interface Lendable {
	final static byte STATE_BORROWED=1;//������
	final static byte STATE_NORMAL=0;//���� ���� ���� ����
	abstract void checkOut(String borrower,String date)throws Exception;
	abstract void checkIn();
}
