package Chap06;

/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 위치 이동 인터페이스를 상속하는 변환 인터페이스
 * 예제 6-35
 */
public interface Transformable extends Movable{
	void resize(int width,int height);//크기 변경
}
