package Chap04;

/*
 * �ۼ�����:2017_03_08
 * �ۼ���:����
 * ����Ʈ �������� ��� ���� �����ִ� ���α׷�1
 * ���� 4-17
 */
public class ShiftExample1 {
	public static void main(String[] args){
		int num=0xFF00FF01;
		int result1 = num<<3;
		int result2 = num>>3;
		int result3 = num>>>3;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
