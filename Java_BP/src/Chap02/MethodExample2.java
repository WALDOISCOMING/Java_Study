package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * 리턴값을 넘겨 받는 메소드 호출문의 예
 * 예제 2-45
 */
public class MethodExample2 {
	public static void main(String[] args){
		int result;
		result = add(3,4);
		System.out.println(result);
		
	}
	static int add(int num1,int num2){
		return num1+num2;
	}
}
