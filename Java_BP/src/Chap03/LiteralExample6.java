package Chap03;


/*
 * �ۼ�����:2017_03_07
 * �ۼ���:����
 * int ���ͷ� ��� ���� �����ִ� ���α׷�
 * ���� 3-11
 */
public class LiteralExample6 {
	public static void main(String[] args){
		char arr[] = {'��','��',' ','\uC790','\uADF9','��','��','\n','J','a','\166','\141'};
		for(char ch:arr){
			System.out.print(ch);
		}
	}
}
