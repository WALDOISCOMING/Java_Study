package Chap09;
/*
 * �ۼ�����:2017_03_13
 * �ۼ���:����
 * equals �޼ҵ带 �̿��� ���ڿ� �� ���α׷�
 * ���� 9-3
 */
public class StringExample5 {

	public static void main(String[] args) {
		String str1 = new String("�ڹ�");
		String str2 = new String("�ڹ�");
		if(str1.equals(str2)){
			System.out.println("����");
		}else{
			System.out.println("����x");
		}
		
	}

}
