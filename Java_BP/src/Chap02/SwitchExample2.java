package Chap02;

/*
 * �ۼ�����:2017_03_07
 * �ۼ���:����
 * �� �̻��� ���� ���� ���� ó����  �ϴ� switch ��
 * ���� 2-29
 */
public class SwitchExample2 {
	public static void main(String[] args){
		char ch = 'p';
		switch(ch){
		case 'A':
		case 'a':
			System.out.println("GM Java");
			break;
		case 'P':
		case 'p':
			System.out.println("GA Java");
			break;
		case 'G':
		case 'g':
			System.out.println("GE Java");
			break;
		default:
			System.out.println("Hello Java");
			break;
		}
		System.out.println("Done.");
	}
}
