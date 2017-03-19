package Chap17;
/*
 * 작성일자:2017_03_19
 * 작성자:길경완
 * 직렬화 가능한 사각형 클래스
 * 예제 17-17
 * 예제 17-19: 새로운 메소드 추가
 * 예제 17-20: 버전 번호 포함 사각형 클래스(1)
 * 예제 17-22 serialver 명령이 생성한  버전 번호를 붙인 사각형 클래스
 */
public class Retangle implements java.io.Serializable{
	static final long serialVersionUID = 100;
	
	int width,height;
	public Retangle(int width,int height) {
		this.width=width;this.height=height;
		// TODO Auto-generated constructor stub
	}
	int getArea(){
		return width*height;
	}
}
