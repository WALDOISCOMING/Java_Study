package Chap08.geometry.shape;
/*
 * �ۼ�����:2017_03_13
 * �ۼ���:����
 * ����Ŭ������ protected ������Ҹ� ����ϴ� ���� Ŭ����
 * ���� 8-14
 */
public class Square extends Chap08.geometry.common.Polygon{
	
	
	public Square(int x,int y,int SiderLength) {
		super(4);
		setPoint(0, x, y);
		setPoint(1, x+SiderLength, y);
		setPoint(2, x+SiderLength, y+SiderLength);
		setPoint(3, x, y+SiderLength);
		// TODO Auto-generated constructor stub
	}
	public int getX(int index){
		return x[index];
	}
	public int getY(int index){
		return y[index];
	}

}
