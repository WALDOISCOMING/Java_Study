package Chap04;

/*
 * �ۼ�����:2017_03_08
 * �ۼ���:����
 * +ó�� ������ �׽�Ʈ�ϴ� ���α׷�
 * ���� 4-4 
 */
public class ConcatExample1 {
	public static void main(String[] args){
		String str1 = "num:"+3+4;
		String str2 = 3 + 4+"num";
		System.out.println(str1);
		System.out.println(str2);
	}
}
