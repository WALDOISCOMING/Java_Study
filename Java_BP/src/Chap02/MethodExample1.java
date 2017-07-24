package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * 메소드 호출 예를 보여주는 프로그램
 * 예제 2-44
 */
public class MethodExample1 {
	public static void main(String[] args){
		printCharacter('*',30);
		System.out.println("Hello Java");
		printCharacter('-',30);
		
	}
	static void printCharacter(char ch,int num){
		for(int cnt=0;cnt<num;cnt++){
			System.out.print(ch);
		}
		System.out.println("");
	}
}
