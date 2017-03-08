package Chap04;

/*
 * 작성일자:2017_03_08
 * 작성자:길경완
 * 복합 대입 연산자의 사용 예를 보여주는 프로그램
 * 예제 4-19
 */
public class CompAssignmentExample1 {
	public static void main(String[] args){
		int num=29;
		num-=2+3*4;
		System.out.println(num);
	}
}
