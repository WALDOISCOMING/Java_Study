package Chap16;

/*
 * �ۼ�����:2017_03_18
 * �ۼ���:����
 * ���� Ŭ������ �� Ŭ����(���� �׽�Ƽ�� Ŭ����)
 * ���� 16-7
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
