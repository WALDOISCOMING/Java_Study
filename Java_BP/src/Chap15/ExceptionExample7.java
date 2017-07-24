package Chap15;

/*
 * �ۼ�����:2017_03_17
 * �ۼ���:����
 * printStackTrace �޼ҵ��� ��� ���� �����ִ� ���α׷�
 * ���� 15-5
 */
public class ExceptionExample7 {
	public static void main(String[] args) throws Exception{

		try{
			int arr[] = new int[0];
			System.out.println(getTotal(arr));
			System.out.println(getAverage(arr));
			
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
	}
	
	static double getAverage(int arr[])throws Exception{
		if(arr.length==0)
			throw new Exception("���ִ� �迭!");
		return getTotal(arr)/arr.length;
	}
	static int getTotal(int arr[])throws Exception{
		if(arr.length==0)
			throw new Exception("���ִ� ���!");
		int total=0;
		for(int num:arr)
			total+=num;
		return total;
	}
	
}
