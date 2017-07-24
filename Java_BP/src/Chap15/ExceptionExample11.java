package Chap15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * �ۼ�����:2017_03_17
 * �ۼ���:����
 * InvalidInputException Ŭ������ ����ϴ� ���α׷�
 * ���� 15-10
 */
public class ExceptionExample11 {
	public static void main(String[] args){
	
		try{
			int result =  substract(5,100);
			System.out.println(result);
			
		}catch(InvalidInputException e){
			System.err.println(e.getMessage());
		}
		/*err �߻�
		 * catch(FileNotFoundException e){
		System.err.println("���� ���� ����");
		}*/
	}
	static int substract(int a,int b)throws InvalidInputException{
		if(a<b)
			throw new InvalidInputException();
		return a-b;
	}
	
}
