package Chap16;


/*
 * �ۼ�����:2017_03_18
 * �ۼ���:����
 * �׽�Ƽ�� �������̽��� �����ϴ� Ŭ������ ���� Ŭ����
 * ���� 16-18
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
			System.out.println("�÷��� �ߴ�");
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void play(String source) {
			System.out.println("�÷��� ����"+source);
			// TODO Auto-generated method stub
			
		}
	}
}
