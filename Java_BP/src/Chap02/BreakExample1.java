package Chap02;

/*
 * �ۼ�����:2017_03_07
 * �ۼ���:����
 * break�� �̿��Ͽ� �ݺ��� ����������
 * ���� 2-38
 */
public class BreakExample1 {
	public static void main(String[] args){
		
		for(int cnt=0;cnt<10;cnt++){
			System.out.println(cnt);
			if(cnt==5)
				break;
		}
		System.out.println("Done.");
	}
}
