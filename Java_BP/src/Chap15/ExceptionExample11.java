package Chap15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 작성일자:2017_03_17
 * 작성자:길경완
 * InvalidInputException 클래스를 사용하는 프로그램
 * 예제 15-10
 */
public class ExceptionExample11 {
	public static void main(String[] args){
	
		try{
			int result =  substract(5,100);
			System.out.println(result);
			
		}catch(InvalidInputException e){
			System.err.println(e.getMessage());
		}
		/*err 발생
		 * catch(FileNotFoundException e){
		System.err.println("ㅎㅎ 파일 없음");
		}*/
	}
	static int substract(int a,int b)throws InvalidInputException{
		if(a<b)
			throw new InvalidInputException();
		return a-b;
	}
	
}
