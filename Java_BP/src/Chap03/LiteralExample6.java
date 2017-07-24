package Chap03;


/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * int 리터럴 사용 예를 보여주는 프로그램
 * 예제 3-11
 */
public class LiteralExample6 {
	public static void main(String[] args){
		char arr[] = {'뇌','를',' ','\uC790','\uADF9','하','는','\n','J','a','\166','\141'};
		for(char ch:arr){
			System.out.print(ch);
		}
	}
}
