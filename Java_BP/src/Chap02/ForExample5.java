package Chap02;

/*
 * �ۼ�����:2017_03_07
 * �ۼ���:����
 * for-each���� ��� ���α׷�
 * ���� 2-37
 */
public class ForExample5 {
	public static void main(String[] args){
		int arr[] = {10,20,30,40,50};
		for(int cnt:arr){
			System.out.println(arr[cnt]);
		}
		System.out.println("Done.");
	}
}
