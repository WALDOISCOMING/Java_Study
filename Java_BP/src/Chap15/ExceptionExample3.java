package Chap15;

/*
 * �ۼ�����:2017_03_17
 * �ۼ���:����
 * checked exception�� unchecked exception�� ������ �޼ҵ�
 * ���� 15-2
 */
public class ExceptionExample3 {
	public static void main(String[] args){
		try{
			int result = add(-1,2);
			System.out.println(result);
			int reulst2 = add(-2,-2);
			System.out.println(reulst2);
			
		}catch(Exception e){
			System.err.println(e);
		}
	}
	static int add(int a,int b) throws Exception{
		int result=a+b;
		if(result<0)
			throw new Exception("�����߻�");
		return result;
	}
}
