package Chap08.math;

public class PlainLabel implements Movable{
	int x,y;

	String str;
	public PlainLabel(int x,int y,String str) {
		this.x=x;this.y=y;this.str=str;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void moveTo(int x, int y) {
		// TODO Auto-generated method stub
		this.x=x;
		this.y=y;
	}
	
}
