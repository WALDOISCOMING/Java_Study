package Chap16;

/*
 * 작성일자:2017_03_18
 * 작성자:길경완
 * 평면 도형 인터페이스를 구현하는 사각형 클래스
 * 예제 16-11
 */

public class Rectangle implements PlaneObject{
	Location location;
	int width,height;
	public Rectangle(int x,int y,int width,int height) {
		this.location = new Location(x,y);
		this.width=width;this.height=height;
		// TODO Auto-generated constructor stub
	}
	@Override
	public Location getLocation() {
		// TODO Auto-generated method stub
		return location;
	}
	@Override
	public void setLocation(int x, int y) {
		// TODO Auto-generated method stub
		location.x=x;location.y=y;
	}
}
