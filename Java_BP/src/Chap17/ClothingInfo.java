package Chap17;
/*
 * �ۼ�����:2017_03_19
 * �ۼ���:����
 * ��ǰ ���� Ŭ������ ���� Ŭ������
 * ���� 17-11
 */
public class ClothingInfo extends GoodsInfo{
	String color;
	char size;
	
	
	public ClothingInfo(String name, String code, int price,String color,char size) {
		super(name, code, price);
		this.color=color;this.size=size;
		// TODO Auto-generated constructor stub
	}

}
