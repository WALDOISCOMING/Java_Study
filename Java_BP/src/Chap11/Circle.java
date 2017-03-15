package Chap11;
/*
 * 작성일자:2017_03_15
 * 작성자:길경완
 * equals 메소드의 오버라이딩 예
 * 예제 11-8
 */
public class Circle {
	int radius;
	public Circle(int radius) {
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Circle))//객체 타입 확인
			return false;
		Circle circle = (Circle)obj;
		if(radius==circle.radius)
			return true;
		else
			return false;
	}
}
