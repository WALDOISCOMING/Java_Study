package Chap04;

/*
 * 작성일자:2017_03_08
 * 작성자:길경완
 * 복잡한 연산식에 ++,--를 사용한 예--바람직하지 못한 예
 * 예제 4-9
 */
public class IncDecExample2 {
	public static void main(String[] args){
		int a =2,b=3,result;
		result=++a+--b*a--;
		System.out.println(a);
		System.out.println(b);
		System.out.println(result);
	}
}
