package Chap12;
/*
 * �ۼ�����:2017_03_16
 * �ۼ���:����
 * �ڵ� Boxing�� ��
 * ���� 12-5
 */
public class WrapperExample5 {
	public static void main(String[] args){
		printDouble(new Double(123.45));
		printDouble(123.45);
	}
	static void printDouble(Double obj){
		System.out.println(obj);
	}
}
