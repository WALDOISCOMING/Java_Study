package Chap05;

/*
 * �ۼ�����:2017_03_09
 * �ۼ���:����
 * �޼ҵ尡 ������ ������ �ͼ����� ó���ϴ� ���α׷�
 * ���� 5-27
 */
public class MethodExample4 {
	public static void main(String[] args){
		int arr[] = new int[0];
		Numbers obj = new Numbers(arr);
		try{
		int total = obj.getTotal();
		int avg = obj.getAverage();//err �߻�
		System.out.println(total);
		System.out.println(avg);
		}catch(ArithmeticException e){
			System.err.println("err!");
		}
	}
}
