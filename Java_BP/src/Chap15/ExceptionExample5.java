package Chap15;

/*
 * �ۼ�����:2017_03_17
 * �ۼ���:����
 * getMessage �޼ҵ��� ��� ���� �����ִ� ���α׷�(1)
 * ���� 15-3
 */
public class ExceptionExample5 {
	public static void main(String[] args){
		int num1=2,num2=0;
		try{
			int result = num1/num2;
			System.out.println(result);

			
		}catch(ArithmeticException e){
			System.err.println(e.getMessage());
		}
	}
	
}
