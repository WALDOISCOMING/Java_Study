package Chap08.math;
/*
 * 작성일자:2017_03_13
 * 작성자:길경완
 * protected메소드를 갖는 point 클래스
 * 예제 8-15
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
