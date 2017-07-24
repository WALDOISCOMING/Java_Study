package Chap16;


/*
 * 작성일자:2017_03_18
 * 작성자:길경완
 * 네스티드 인터페이스를 포함하는 클래스와 서브 클래스
 * 예제 16-18
 */

public class MP3PlayerFactory extends PlayerFactory{

	
	@Override
	Player createPlayer() {
		// TODO Auto-generated method stub
		return new MP3Player();
	}
	
	class MP3Player implements Player{

		@Override
		public void stop() {
			System.out.println("플레이 중단");
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void play(String source) {
			System.out.println("플레이 시작"+source);
			// TODO Auto-generated method stub
			
		}
	}
}
