package Chap08.geometry;
/*
 * �ۼ�����:2017_03_12
 * �ۼ���:����
 * ��Ű�� ������ �����ϴ� Ŭ����
 * ���� 8-1
 */
class Circle {
	int radius;
	Circle(int radiis) {
		this.radius=radiis;
		// TODO Auto-generated constructor stub
	}
	double getArea(){
		return radius*radius*3.14;
	}
}
