package Chap18;
/*
 * �ۼ�����:2017_03_19
 * �ۼ���:����
 * �ѱ� ������ ���� �ҹ��ڸ� ���ÿ� ����ϴ� ��Ƽ ������ ���α׷�(�̿ϼ�)
 * ���� 18-5
 */
public class MultithreadExample3 {
	public static void main(String[] args){
		Thread thread = new Thread(new SmallLetters());
		thread.start();
		char arr[] = {'��','��','��','��','��','��','��','��','��','��','��','��','��','��'};
		for(char ch:arr)
			System.out.print(ch);
		
	}
}
