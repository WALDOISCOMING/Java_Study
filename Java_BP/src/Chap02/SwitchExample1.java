package Chap02;

/*
 * �ۼ�����:2017_03_07
 * �ۼ���:����
 * switch���� �������� ��� ���� �����ִ� ���α׷�
 * ���� 2-27
 */
public class SwitchExample1 {
	public static void main(String[] args){
		int num=3;
		switch(num){
		case 1:
			System.out.println("GM Java");
			break;
		case 2:
			System.out.println("GA Java");
			break;
		case 3:
			System.out.println("GE Java");
			break;
		default:
			System.out.println("Hello Java");
			break;
		}
		System.out.println("Done.");
	}
}
