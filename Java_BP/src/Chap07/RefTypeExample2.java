package Chap07;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 파ㅓ라미터로 넘겨진 레퍼런스 타입 데이터를 메소드 안에 수정하는 예
 * 예제 7-3
 */
public class RefTypeExample2 {
	public static void main(String[] args){
		Point obj = new Point(10,20);
		System.out.printf("(%d,%d)%n",obj.x,obj.y);
		rearrange(obj);
		System.out.printf("(%d,%d)%n",obj.x,obj.y);
	}
	static void rearrange(Point point){
		point.x = 30;
		point.y = 40;
	}
}
