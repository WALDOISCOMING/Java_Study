package Chap09;
import java.util.StringTokenizer;
/*
 * �ۼ�����:2017_03_13
 * �ۼ���:����
 * ��ȹ ���ڸ� ��ū���� �����ϴ� ��
 * ���� 9-12
 */

public class StringTokenizerExample3 {
	public static void main(String[] args){
		StringTokenizer stok = new StringTokenizer(
				"���=10|��=3|������=1","=|",true);
		while(stok.hasMoreTokens()){
			String token=stok.nextToken();
			if(token.equals("="))
				System.out.print("\t");
			else if(token.equals("|"))
				System.out.print("\n");
			else
				System.out.print(token);
		}
	}
}
