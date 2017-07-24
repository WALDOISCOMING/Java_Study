package Chap07;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * null값을 갖는 레퍼런스 변수
 * 예제 7-4
 */
public class RefTypeExample4 {
	public static void main(String[] args){
		Point obj =null;
		try{
		System.out.printf("(%d,%d)%n",obj.x,obj.y);
		}catch(Exception e){
			System.err.println(e);
		}
		
	}
	
}
