package Chap02;

/*
 * �ۼ�����:2017_03_07
 * �ۼ���:����
 * �迭�� ������ ����ϴ� ���α׷�
 * ���� 2-20
 */
public class ArrayExample5 {
	public static void main(String[] args){
		int arr[] ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println(arr.length);
		System.out.println("��ȯ����!"+ArrayLength(arr));
		
		
	}
	
	static int ArrayLength(int arr[]){
		int i=0;
		for(int value : arr){
			System.out.println(i+"index�� "+value+"��!");
			i++;
		}
		
		return i;
	}
}
