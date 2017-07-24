package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * 배열 항목을 초기화하는 2차원 배열 변수의 선언문의 예
 * 예제 2-19
 */
public class ArrayExample4 {
	public static void main(String[] args){
		int table[][]={	{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}};
		System.out.println(table[0][0]);
		System.out.println(table[1][1]);
		System.out.println(table[2][3]);
	}
}
