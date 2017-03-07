package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * main 메소드 파라미터 변수 사용
 * 예제 2-47
 */
public class ParamExample1 {
	public static void main(String[] args){
		for(String arg:args){
			System.out.println(arg);
		}
		System.out.println("length="+args.length);
		
	}
	
}
