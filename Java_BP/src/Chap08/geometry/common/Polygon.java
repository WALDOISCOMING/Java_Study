package Chap08.geometry.common;
/*
 * �ۼ�����:2017_03_13
 * �ۼ���:����
 * protected ������Ҹ� �����ϴ� Ŭ������ ��
 * ���� 8-13
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
