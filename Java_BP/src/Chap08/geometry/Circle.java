package Chap08.geometry;
/*
 * �ۼ�����:2017_03_12
 * �ۼ���:����
 * ��Ű�� ������ �����ϴ� Ŭ����
 * ���� 8-1
 */
public class Circle {
	public int radius;
	public Circle(int radiis) {
		this.radius=radiis;
		// TODO Auto-generated constructor stub
	}
	public double getArea(){
		return radius*radius*3.14;
	}
}
