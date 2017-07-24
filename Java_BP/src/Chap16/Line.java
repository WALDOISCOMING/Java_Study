package Chap16;

/*
 * 작성일자:2017_03_18
 * 작성자:길경완
 * 직선 클래스와 점 클래스(정적 네스티드 클래스)
 * 예제 16-7
 */
public class Line {
	Point point1,point2;
	Line(int x1,int y1,int x2,int y2){
		point1 = new Point(x1,y1);
		point2 = new Point(x2,y2);
	}
	void move(int offsetx,int offsety){
		point1.x+=offsetx;point1.y+=offsety;point2.x+=offsetx;point2.y+=offsety;
	}
	
	static class Point{
		int x, y;
		Point(int x,int y){
			this.x=x;this.y=y;
		}
	}
}
