package Chap08.math;
/*
 * �ۼ�����:2017_03_13
 * �ۼ���:����
 * protected�޼ҵ带 ���� point Ŭ����
 * ���� 8-15
 */
class Point {
 int x,y;
 Point(int x,int y) {
	 this.x=x;this.y=y;
	// TODO Auto-generated constructor stub
}
 protected int  getX() {
	return this.x;
}
 protected int getY(){
	 return this.y;
 }
}
