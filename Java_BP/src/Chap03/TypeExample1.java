package Chap03;

/*
 * �ۼ�����:2017_03_07
 * �ۼ���:����
 * double Ÿ���� ���� �̼��� ���� 2�� ������ ���α׷�
 * ���� 3-4
 */
public class TypeExample1 {
	public static void main(String[] args){
		double smallest1 = 4.9e-324;
		double smallest2 = -4.9e-324;
		double result1,result2;
		result1 = smallest1/2.0;
		result2 = smallest2/2.0;
		System.out.println(result1);
		System.out.println(result2);
	}
}
