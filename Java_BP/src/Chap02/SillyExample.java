package Chap02;

/*
 * �ۼ�����:2017_03_07
 * �ۼ���:����
 * �ͼ��� �߻��ϴ� ���α׷�
 * ���� 2-48,49�� 48�� ���� ��Ʈ��
 */
public class SillyExample {
	public static void main(String[] args){
		int a = 3,b=0;
		int result;
		try{

			result = a/b;
			System.out.println(result);//error �߻�
		}catch(ArithmeticException e){
			System.out.println("0���� �������� �ߴ�.");
		}finally {
			System.out.println("Done.");
		}
	}
	
}
