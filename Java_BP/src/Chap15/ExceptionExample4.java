package Chap15;

/*
 * �ۼ�����:2017_03_17
 * �ۼ���:����
 * checked exception�� unchecked exception�� ������ �޼ҵ�
 * ���� 15-2
 */
public class ExceptionExample4 {
	public static void main(String[] args){
		try{
			int result = div(3,0);
			System.out.println(result);
		}catch(ArithmeticException e){
			System.err.println(e);
		}
	}
	static int div(int a,int b) {
		int result=a/b;
		
		return result;
	}
}
