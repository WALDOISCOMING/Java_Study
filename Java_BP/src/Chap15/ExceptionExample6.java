package Chap15;

/*
 * �ۼ�����:2017_03_17
 * �ۼ���:����
 * getMessage �޼ҵ��� ��� ���� �����ִ� ���α׷�(2)
 * ���� 15-4
 */
public class ExceptionExample6 {
	public static void main(String[] args){
		int num1=2,num2=3;
		try{
			int result = num1-num2;
			if(result<0)
				throw new Exception("�߸��� ���");
			
			System.out.println(result);
			
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
	}
	
}
