package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * 중첩된 반복문의 바깥쪽 반복을 계속하는 continue문의 예
 * 예제 2-43
 */
public class ContinueExample3 {
	public static void main(String[] args){
outerLoop:
	for(int row = 0;row<3;row++){
		for(int col = 0;col<5;col++){
			if(row==1&&col==3)
				continue outerLoop;
			System.out.println(row+","+col);
		}
	}
		
	}
}
