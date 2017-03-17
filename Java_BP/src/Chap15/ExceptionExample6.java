package Chap15;

/*
 * 작성일자:2017_03_17
 * 작성자:길경완
 * getMessage 메소드의 사용 예를 보여주는 프로그램(2)
 * 예제 15-4
 */
public class ExceptionExample6 {
	public static void main(String[] args){
		int num1=2,num2=3;
		try{
			int result = num1-num2;
			if(result<0)
				throw new Exception("잘못된 결과");
			
			System.out.println(result);
			
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
	}
	
}
