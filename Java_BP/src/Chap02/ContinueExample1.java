package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * continue문의 올바른 사용
 * 예제 2-41
 */
public class ContinueExample1 {
	public static void main(String[] args){
		for(int row=0;row<10;row++){
			if(row==5)
				continue;
			System.out.println(row);
		}
		System.out.println("Done.");
	}
}
