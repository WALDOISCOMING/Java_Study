package Chap15;

/*
 * 작성일자:2017_03_17
 * 작성자:길경완
 * printStackTrace 메소드의 사용 예를 보여주는 프로그램
 * 예제 15-5
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
			throw new Exception("비여있는 배열!");
		return getTotal(arr)/arr.length;
	}
	static int getTotal(int arr[])throws Exception{
		if(arr.length==0)
			throw new Exception("비여있는 배욜!");
		int total=0;
		for(int num:arr)
			total+=num;
		return total;
	}
	
}
