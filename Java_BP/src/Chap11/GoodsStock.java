package Chap11;
/*
 * �ۼ�����:2017_03_15
 * �ۼ���:����
 * toString�޼ҵ� �������̵��� ��
 * ���� 11-3
 */
public class GoodsStock {
	String goodsCode;
	int stockNum;
	public GoodsStock(String goodsCode,int stockNum) {
		this.goodsCode=goodsCode;this.stockNum=stockNum;
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		return "��ǰ�ڵ�: "+goodsCode+"\n������: "+stockNum+"\n";
	}
}
