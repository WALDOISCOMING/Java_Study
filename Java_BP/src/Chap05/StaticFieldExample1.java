package Chap05;

/*
 * �ۼ�����:2017_03_09
 * �ۼ���:����
 * Accumlate Ŭ���� �̿�
 * ���� 5-34
 * ���� 5-38 :���� �޼ҵ带 ȣ���ϴ� ���α׷�
 */
public class StaticFieldExample1 {
	public static void main(String[] args){
		Accumlator obj1 = new Accumlator();
		Accumlator obj2 = new Accumlator();
		obj1.accumlate(10);
		obj2.accumlate(20);
		int getTotal = Accumlator.getGrandTotal();
		System.out.println(obj1.total);
		System.out.println(getTotal);
		System.out.println(obj2.total);
		System.out.println(getTotal);
	}
}
