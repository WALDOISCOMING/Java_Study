package Chap06;

public interface Movable {
	void moveTo(int x,int y);//절대위치로 이동
	void moveBy(int xOffset,int yOffset);//상대 위치만큼 이동
	
}
