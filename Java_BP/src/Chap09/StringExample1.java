package Chap09;
/*
 * �ۼ�����:2017_03_13
 * �ۼ���:����
 * String Ŭ������ length,charAt �޼ҵ� ��� ��
 * ���� 9-1
 */
public class StringExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "�ڹ� Ŀ��";
		int len = str.length();
		for(int cnt=0;cnt<len;cnt++){
			char ch = str.charAt(cnt);
			System.out.println(ch);
		}
	}

}
