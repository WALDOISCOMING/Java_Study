package Chap07;
/*
 * �ۼ�����:2017_03_12
 * �ۼ���:����
 * ������� ǥ���ϴ� �ڵ� ������ ����� �����ؼ� ����ϴ� ��
 * ���� 7-14
 * ���� 7-16: ����� ���� Ÿ���� Ŭ���� �ȿ� �����Ͽ� ����ϴ� ��
 */
public class ClothingInfo {
	enum Season{
		SPRING,SUMMER,FALL,WINTER
	}
	String code;
	String name;
	String material;
	Season season;
	static final int SPRING=1;
	static final int SUMMER=2;
	static final int FALL=3;
	static final int WINTER=4;
	public ClothingInfo(String code,String name,String material,Season season) {
	this.code=code;this.name=name;this.material=material;this.season=season;
		// TODO Auto-generated constructor stub
	}
	
}
