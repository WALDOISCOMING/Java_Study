package Chap18;
/*
 * �ۼ�����:2017_03_19
 * �ۼ���:����
 * ���ĺ��� ���ڸ� ���ÿ� ����ϴ� ��Ƽ ������ ���α׷�(�̿ϼ�)
 * ���� 18-1
 * ���� 18-2: ���ĺ��� ���ڸ� ���ÿ� ����ϴ� ��Ƽ ������ ���α׷�(1)
 * ���� 18-3: ���ĺ��� ���ڸ� ���ÿ� ����ϴ� ��Ƽ ������ ���α׷�(2)
 */
public class MultithreadExample1 {
	public static void main(String[] args){
		Thread thread = new DigitThread();
		thread.start();
		
		for(char ch='A';ch<='Z';ch++){
			System.out.println(ch);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
