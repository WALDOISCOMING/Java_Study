package Chap02;

/*
 * �ۼ�����:2017_03_06
 * �ۼ���:����
 * �� �ۿ��� ����� ������ �� �ȿ��� ��� �ϴ� ��
 * ���� 2-11
 */
public class DecExample5 {
	public static void main(String[] args){
		int num = 10;
		{
			num = 30;
		}
		System.out.println(num);
	}
}
