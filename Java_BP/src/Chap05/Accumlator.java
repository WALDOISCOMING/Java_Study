package Chap05;

/*
 * �ۼ�����:2017_03_09
 * �ۼ���:����
 * �����ʵ尡 �ִ� Ŭ����
 * ���� 5-33
 * ���� 5-37 :���� �޼ҵ带 �����ϴ� Ŭ����
 */
public class Accumlator {
	int total=0;
	static int grandTotal=0;
	void accumlate(int amount){
		total+=amount;
		grandTotal+=amount;
	}
	static int getGrandTotal(){
		return grandTotal;
	}
}
