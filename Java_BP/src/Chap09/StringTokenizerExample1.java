package Chap09;
import java.util.StringTokenizer;
/*
 * �ۼ�����:2017_03_13
 * �ۼ���:����
 * StringTokenizer�� �̿��ؼ� ���ڿ��κ��� ��ū�� �и��ϴ� ���α׷�
 * ���� 9-10
 */

public class StringTokenizerExample1 {
	public static void main(String[] args){
		StringTokenizer stok = new StringTokenizer("��� �� ������");
		while(stok.hasMoreTokens()){
			String str=stok.nextToken();
			System.out.println(str);
		}
	}
}
