package Chap02;

/*
 * �ۼ�����:2017_03_07
 * �ۼ���:����
 * �� ���� �̻��� �ͼ��� ó�� try ��
 * ���� 2-51
 */
public class TryExample {
	public static void main(String[] args){
		int div[]={5,4,3,2,1,0};
		for(int cnt=0;cnt<10;cnt++){
			try{
				int share = 100/div[cnt];
				System.out.println(share);
			}catch(ArithmeticException e){
				System.out.println("0���� �������� �ߴ�.");
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("�߸��� �͵��� ����");
			}
			
		}
		
		System.out.println("Done.");
	}
}
