package Chap16;

/*
 * 작성일자:2017_03_18
 * 작성자:길경완
 * 평면 도형 인터페이스와 위치 클래스(정적 네스티드 클래스)
 * 예제 16-10
 */

public interface PlaneObject {

	Location getLocation();
	void setLocation(int x,int y);
	static class Location{
		int x,y;
		public Location(int x,int y) {
			this.x=x;this.y=y;
			// TODO Auto-generated constructor stub
		}
	}
}
