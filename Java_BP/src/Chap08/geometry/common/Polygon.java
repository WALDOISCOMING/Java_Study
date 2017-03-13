package Chap08.geometry.common;
/*
 * 작성일자:2017_03_13
 * 작성자:길경완
 * protected 구성요소를 포함하는 클래스의 예
 * 예제 8-13
 */
public class Polygon {
	protected int x[];
	protected int y[];
	protected Polygon(int vertexNum){
		x = new int[vertexNum];y=new int[vertexNum];
	}
	protected void setPoint(int index,int x,int y){
		this.x[index] = x;this.y[index]=y;
	}
}
