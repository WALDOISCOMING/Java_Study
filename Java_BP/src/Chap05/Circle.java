package Chap05;

/*
 * �ۼ�����:2017_03_09
 * �ۼ���:����
 * �ʵ� ������ ��
 * ���� 5-12
 * ���� 5-13: �ʵ�,�޼ҵ�,�������� ��ġ�� �ٲ� ��� x
 * ���� 5-14: private�� ������ Ŭ������ ��
 */
public class Circle {
	private double radius;
	Circle(double radius) {
		this.radius =radius;
	}
	double getArea(){
		double area;
		area = radius*radius*3.14;
		return area;
	}
}
