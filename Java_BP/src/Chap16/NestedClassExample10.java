package Chap16;


/*
 * �ۼ�����:2017_03_18
 * �ۼ���:����
 * �̸� ���� �̳� Ŭ������ ��(2)
 * ���� 16-17
 */
public class NestedClassExample10 {
	public static void main(String[] args){
		
		Player player = new Player() {
			
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
		};
		player.play("�뷡.mp3");
		player.stop();
		
				
	}
}
