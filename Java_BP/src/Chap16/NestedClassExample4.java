package Chap16;


/*
 * �ۼ�����:2017_03_18
 * �ۼ���:����
 * ���� ������ Ŭ������ ����ϴ� ���α׷�(2)
 * ���� 16-6
 */
public class NestedClassExample4 {
	public static void main(String[] args){
		PiggyBank b1 = new PiggyBank();
		PiggyBank b2 = new PiggyBank();
		PiggyBank.Slot tmp = b1.slot;
		//���� slot�� �ٲ� �� ���� ��.
		b1.slot = b2.slot;
		b2.slot =tmp;
		b1.slot.put(10000);
		b2.slot.put(10);
		System.out.println(b1.total);
		System.out.println(b2.total);
	}
	
}
