package Chap05;

/*
 * �ۼ�����:2017_03_09
 * �ۼ���:����
 * ��ǰ ��� Ŭ����
 * goodscode�� ��ǰ ��
 * stockNum ���� ����
 * �޼ҵ� addstock ���� �߰�
 * �޼ҵ� substractStock�� ���� ����
 * ���� 5-2
 * ���� 5-4: �����ڸ� �߰�
 */
public class GoodStock {
	String goodsCode;
	int stockNum;
	public GoodStock(String code,int num) {
	 goodsCode = code;
	 stockNum = num;
	}
	void addStock(int amount){
		stockNum+=amount;				
	}
	int subtractStock(int amount){
		if(stockNum<amount)
			return 0;
		stockNum-=amount;
		return amount;
	}
}
