package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * 2차원 배열의 사용 예를 보여주는 프로그램
 * 예제 2-16
 */
public class ArrayExample2 {
	public static void main(String[] args){
		int table[][] = new int[3][4];
		table[0][0]=10;
		table[1][1] = 20;
		table[2][3] = table[0][0]+table[1][1];
		System.out.println(table[0][0]);
		System.out.println(table[1][1]);
		System.out.println(table[2][3]);
	
	}
}
