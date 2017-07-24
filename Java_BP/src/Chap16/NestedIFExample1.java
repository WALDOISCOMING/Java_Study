package Chap16;

/*
 * 작성일자:2017_03_18
 * 작성자:길경완
 * MP3PlayerFactory 클래스를 사용하는 프로그램
 * 예제 16-19
 */
public class NestedIFExample1 {
	public static void main(String[] args){
		MP3PlayerFactory f = new MP3PlayerFactory();
		PlayerFactory.Player p = f.createPlayer();
		p.play("아리랑");
		p.stop();
	}
}
