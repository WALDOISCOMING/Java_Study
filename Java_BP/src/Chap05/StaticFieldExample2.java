package Chap05;

/*
 * �ۼ�����:2017_03_09
 * �ۼ���:����
 * ��� �ʵ带 ����ϴ� ���α׷�
 * ���� 5-36
 */
public class StaticFieldExample2 {
	public static void main(String[] args){
		LimitedValue v = new LimitedValue();
		v.setValue(200000);
		System.out.println(v.value);
		System.out.println(v.UPPER_LIMIT);
	}
}
