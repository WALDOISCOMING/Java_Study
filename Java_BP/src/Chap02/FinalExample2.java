package Chap02;

/*
 * �ۼ�����:2017_03_06
 * �ۼ���:����
 * final ������ �߸��� ��� ��
 * ���� 2-13
 */
public class FinalExample2 {
	public static void main(String[] args){
		final double pi;
		double radius = 2.0,circum;
		pi=3.14;
		circum = 2*pi*radius;
		System.out.println(circum);
//		pi=3.14159;�� �ٸ� ���� �ִ� �߸��� ��ɹ�
		double area= 2*pi*radius*radius;
		System.out.println(area);
	}
}
