package Chap09;
/*
 * �ۼ�����:2017_03_13
 * �ۼ���:����
 * StringBuilder ��ü�� ���� ũ�⸦ ���ڿ��� �°� ���̴� ���α׷�
 * ���� 9-9
 */
public class StringBuilderExample4 {

	public static void main(String[] args) {
	StringBuilder sb = new StringBuilder(100);
    sb.append("�ڹ�");
    System.out.println(sb+":"+sb.capacity());
    sb.trimToSize();
    System.out.println(sb+":"+sb.capacity());
	}
	
}	
