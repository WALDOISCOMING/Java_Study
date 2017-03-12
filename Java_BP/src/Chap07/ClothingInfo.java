package Chap07;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 사계절을 표현하는 코드 ㄱ밧을 상수로 선언해서 사용하는 예
 * 예제 7-14
 * 예제 7-16: 사계절 엵거 타입을 클래스 안에 선언하여 사용하는 예
 */
public class ClothingInfo {
	enum Season{
		SPRING,SUMMER,FALL,WINTER
	}
	String code;
	String name;
	String material;
	Season season;
	static final int SPRING=1;
	static final int SUMMER=2;
	static final int FALL=3;
	static final int WINTER=4;
	public ClothingInfo(String code,String name,String material,Season season) {
	this.code=code;this.name=name;this.material=material;this.season=season;
		// TODO Auto-generated constructor stub
	}
	
}
