package Chap16;

/*
 * �ۼ�����:2017_03_18
 * �ۼ���:����
 * ��� ���� �������̽��� ��ġ Ŭ����(���� �׽�Ƽ�� Ŭ����)
 * ���� 16-10
 */

public interface PlaneObject {

	Location getLocation();
	void setLocation(int x,int y);
	static class Location{
		int x,y;
		public Location(int x,int y) {
			this.x=x;this.y=y;
			// TODO Auto-generated constructor stub
		}
	}
}
