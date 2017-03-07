package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * 중첩ㄷ된 반복문 안에서 break문을 사용한 예
 * 예제 2-39
 */
public class BreakExample2 {
	public static void main(String[] args){
		for(int row=0;row<3;row++){
			for(int col=0;col<5;col++){
				System.out.println("("+row+","+col+")");
				if(row==1&&col==3)
					break;
			}
		}
		System.out.println("Done.");
	}
}
