package Chap05;

/*
 * �ۼ�����:2017_03_09
 * �ۼ���:����
 * GoodStock�� ��ü�� �������� �̿��ϴ� ���α׷�
 * ���� 5-3
 * ���� 5-5 : 5-4���� ���� �����ڸ� �̿�.
 */
public class ClassExample1 {
	public static void main(String[] args){
		GoodStock obj;
		obj = new GoodStock("52135",200);
		//obj.goodsCode="52135";
		//obj.stockNum = 200;
		System.out.println(obj.goodsCode);
		System.out.println(obj.stockNum);
		obj.addStock(1000);
		System.out.println(obj.goodsCode);
		System.out.println(obj.stockNum);
	}
}
