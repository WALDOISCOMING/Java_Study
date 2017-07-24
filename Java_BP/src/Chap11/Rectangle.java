package Chap11;

public class Rectangle implements Cloneable{
	int width,height;
	public Rectangle(int width,int height) {
		this.width=width;this.height=height;
		// TODO Auto-generated constructor stub
	}
	public Object clone(){
		try{
		return super.clone();
		}catch(CloneNotSupportedException e){
			System.err.println(e);
			return null;
		}
	}
	int getArea(){
		return width*height;
	}
}
