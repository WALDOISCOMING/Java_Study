package Chap08.math;
/*
 * 작성일자:2017_03_13
 * 작성자:길경완
 * protected 메소드를 잘못 오버라이드하는 Point3D 클래스
 * 예제 8-16
 */
public class Point3D extends Point{
	int z;
	Point3D(int x, int y,int z) {
		super(x, y);
		this.z=z;
		// TODO Auto-generated constructor stub
	}
	//protected나 public처럼 default보다 강한 키워드를 넣어줘야 오류 발생하지 않는다.
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
