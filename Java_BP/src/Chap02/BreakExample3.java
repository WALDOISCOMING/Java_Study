package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * 라벨을 지정한 break문을 이용하여 중첩된 반복문을 빠져나가기
 * 예제 2-40
 */
public class BreakExample3 {
	public static void main(String[] args){
		outerLoop:
		for(int row=0;row<3;row++){
			for(int col=0;col<5;col++){
				System.out.println("("+row+","+col+")");
				if(row==1&&col==3)
					break outerLoop;
			}
		}
		System.out.println("Done.");
	}
}
