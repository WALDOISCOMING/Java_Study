package Chap02;

/*
 * �ۼ�����:2017_03_07
 * �ۼ���:����
 * 1���� �迭�� ��� ���� �����ִ� ���α׷�
 * ���� 2-16
 */
public class ArrayExample1 {
	public static void main(String[] args){
		int arr[];
		arr = new int[10];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = arr[0]+arr[1];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
