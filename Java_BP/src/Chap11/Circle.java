package Chap11;
/*
 * �ۼ�����:2017_03_15
 * �ۼ���:����
 * equals �޼ҵ��� �������̵� ��
 * ���� 11-8
 */
public class Circle {
	int radius;
	public Circle(int radius) {
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Circle))//��ü Ÿ�� Ȯ��
			return false;
		Circle circle = (Circle)obj;
		if(radius==circle.radius)
			return true;
		else
			return false;
	}
}
