package Chap12;
/*
 * �ۼ�����:2017_03_16
 * �ۼ���:����
 * Wrapper Ŭ������ parse- �޼ҵ� ��� ��
 * ���� 12-3
 */
public class WrapperExample3 {
	public static void main(String[] args){
		int total = 0;
		for(int cnt=0;cnt<args.length;cnt++){
			total+=Integer.parseInt(args[cnt]);
			System.out.println(total);
		}
		
	}
}
