package Chap02;

/*
 * �ۼ�����:2017_03_07
 * �ۼ���:����
 * continue���� �ùٸ� ���
 * ���� 2-41
 */
public class ContinueExample1 {
	public static void main(String[] args){
		for(int row=0;row<10;row++){
			if(row==5)
				continue;
			System.out.println(row);
		}
		System.out.println("Done.");
	}
}
