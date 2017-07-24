package Chap07;

/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 레퍼런스 변수를 null 참조값과 비교해서 처리하는 프로그램
 * 예제 7-5
 */
public class RefTypeExample5 {
	public static void main(String[] args){
		Point obj=null;
		if(obj==null){
			System.out.println("obj가 가르키는 객체 없다");
			return;
		}
		System.out.println(obj.x);
		System.out.println(obj.y);
		//System.out.printf("(%d,%d)%n",obj.x,obj.y);
	}
	
}
