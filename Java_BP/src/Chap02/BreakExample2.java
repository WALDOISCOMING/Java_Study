package Chap02;

/*
 * �ۼ�����:2017_03_07
 * �ۼ���:����
 * ��ø���� �ݺ��� �ȿ��� break���� ����� ��
 * ���� 2-39
 */
public class BreakExample2 {
	public static void main(String[] args){
		for(int row=0;row<3;row++){
			for(int col=0;col<5;col++){
				System.out.println("("+row+","+col+")");
				if(row==1&&col==3)
					break;
			}
		}
		System.out.println("Done.");
	}
}
