package Chap17;
/*
 * �ۼ�����:2017_03_19
 * �ۼ���:����
 * ����ȭ ������ �簢�� Ŭ����
 * ���� 17-17
 * ���� 17-19: ���ο� �޼ҵ� �߰�
 * ���� 17-20: ���� ��ȣ ���� �簢�� Ŭ����(1)
 * ���� 17-22 serialver ����� ������  ���� ��ȣ�� ���� �簢�� Ŭ����
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
