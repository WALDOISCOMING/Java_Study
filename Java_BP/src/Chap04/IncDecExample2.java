package Chap04;

/*
 * �ۼ�����:2017_03_08
 * �ۼ���:����
 * ������ ����Ŀ� ++,--�� ����� ��--�ٶ������� ���� ��
 * ���� 4-9
 */
public class IncDecExample2 {
	public static void main(String[] args){
		int a =2,b=3,result;
		result=++a+--b*a--;
		System.out.println(a);
		System.out.println(b);
		System.out.println(result);
	}
}
