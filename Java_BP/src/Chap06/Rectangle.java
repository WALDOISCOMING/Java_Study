package Chap06;

/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 변환 인터페이스를 구현하는 사각형 클래스
 * 예제 6-36
 */

public class Rectangle implements Transformable{
	int x,y,width,height;
	public Rectangle(int x,int y,int width,int height) {
		this.x=x;this.y=y;this.width=width;this.height=height;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void moveTo(int x, int y) {
		// TODO Auto-generated method stub
		this.x=x;this.y=y;
	}

	@Override
	public void moveBy(int xOffset, int yOffset) {
		// TODO Auto-generated method stub
		this.x+=xOffset;this.y+=yOffset;
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		this.width=width;
		this.height=height;
	}

}
