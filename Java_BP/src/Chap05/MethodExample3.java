package Chap05;

/*
 * �ۼ�����:2017_03_09
 * �ۼ���:����
 * numbers �ͼ��� �߻�
 * ���� 5-26
 */
public class MethodExample3 {
	public static void main(String[] args){
		int arr[] = new int[0];
		Numbers obj = new Numbers(arr);
		int total = obj.getTotal();
		int avg = obj.getAverage();//err �߻�
		System.out.println(total);
		System.out.println(avg);
	}
}
