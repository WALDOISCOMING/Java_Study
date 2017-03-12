package Chap06;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 외형변경 인터페이스를 구현하는 라벨 클래스
 * 예제 6-39
 */
public class Label implements Changeable{
	String text;
	int width,height;
	String foreground,background;
	String font;
	public Label(String text,int width,int height,String foreground,String background,String font) {
	this.text=text;this.width=width;this.height=height;this.foreground=foreground;this.background=background;
	this.font=font;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		this.width=width;
		this.height=height;
	}

	@Override
	public void setForeground(String color) {
		// TODO Auto-generated method stub
		this.foreground=color;
	}

	@Override
	public void setBackground(String color) {
		// TODO Auto-generated method stub
		this.background=color;
	}

	@Override
	public void setFont(String font) {
		// TODO Auto-generated method stub
		this.font=font;
	}

}
