package Chap16;


/*
 * 작성일자:2017_03_18
 * 작성자:길경완
 * 이름 없는 이너 클래스의 예(2)
 * 예제 16-17
 */
public class NestedClassExample10 {
	public static void main(String[] args){
		
		Player player = new Player() {
			
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
		};
		player.play("노래.mp3");
		player.stop();
		
				
	}
}
