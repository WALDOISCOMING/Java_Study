package Chap06;

/*
 * �ۼ�����:2017_03_12
 * �ۼ���:����
 * ��ȯ �������̽��� �����ϴ� �簢�� Ŭ����
 * ���� 6-36
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
