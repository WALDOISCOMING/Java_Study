package Chap16;

/*
 * �ۼ�����:2017_03_18
 * �ۼ���:����
 * MP3PlayerFactory Ŭ������ ����ϴ� ���α׷�
 * ���� 16-19
 */
public class NestedIFExample1 {
	public static void main(String[] args){
		MP3PlayerFactory f = new MP3PlayerFactory();
		PlayerFactory.Player p = f.createPlayer();
		p.play("�Ƹ���");
		p.stop();
	}
}
