package Chap08.math;
/*
 * �ۼ�����:2017_03_13
 * �ۼ���:����
 * protected �޼ҵ带 �߸� �������̵��ϴ� Point3D Ŭ����
 * ���� 8-16
 */
public class Point3D extends Point{
	int z;
	Point3D(int x, int y,int z) {
		super(x, y);
		this.z=z;
		// TODO Auto-generated constructor stub
	}
	//protected�� publicó�� default���� ���� Ű���带 �־���� ���� �߻����� �ʴ´�.
	protected int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	protected int getZ(){
		return z;
	}
}
