package Chap05;

/*
 * �ۼ�����:2017_03_09
 * �ۼ���:����
 * Numbers �̿�
 * ���� 5-25
 */
public class MethodExample2 {
	public static void main(String[] args){
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		Numbers obj = new Numbers(arr);
		int total = obj.getTotal();
		int avg = obj.getAverage();
		System.out.println(total);
		System.out.println(avg);
	}
}
