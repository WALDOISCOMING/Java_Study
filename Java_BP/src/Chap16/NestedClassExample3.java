package Chap16;


/*
 * �ۼ�����:2017_03_18
 * �ۼ���:����
 * ���� ������ Ŭ������ ����ϴ� ���α׷�(1)
 * ���� 16-5
 */
public class NestedClassExample3 {
	public static void main(String[] args){
		PiggyBank b1 = new PiggyBank();
		PiggyBank b2 = new PiggyBank();
		PiggyBank b3 = new PiggyBank();
		b2.slot.put(100);
		System.out.println(b1.total);
		System.out.println(b2.total);
		System.out.println(b3.total);
	}
	
}
