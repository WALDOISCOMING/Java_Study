package Chap09;
import java.util.StringTokenizer;
/*
 * �ۼ�����:2017_03_13
 * �ۼ���:����
 * ���� ���ڰ� �ƴ� ��ȹ ���ڸ� �̿��Ͽ� ��ū�� �����ϴ� ��
 * ���� 9-11
 */

public class StringTokenizerExample2 {
	public static void main(String[] args){
		StringTokenizer stok = new StringTokenizer("���,��a������.���",",.a");
		while(stok.hasMoreTokens()){
			String str=stok.nextToken();
			System.out.println(str);
		}
	}
}
