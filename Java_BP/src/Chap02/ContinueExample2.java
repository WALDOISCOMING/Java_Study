package Chap02;

/*
 * �ۼ�����:2017_03_07
 * �ۼ���:����
 * continue���� Ʋ�� ���
 * ���� 2-42
 */
public class ContinueExample2 {
	public static void main(String[] args){
		int cnt = 0;
		while(cnt<10){
			if(cnt==5)
				continue;
			System.out.println(cnt);
			cnt++;
		}
		System.out.println("Done.");
	}
}
