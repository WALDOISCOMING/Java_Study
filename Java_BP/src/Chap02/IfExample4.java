package Chap02;

/*
 * �ۼ�����:2017_03_07
 * �ۼ���:����
 * if���� ��� ���� �����ִ� ���α׷�
 * ���� 2-24�� 2-24�� ���� 2-25
 */
public class IfExample4 {
	public static void main(String[] args){
		int num1 = 152;
		int num2 = 173;
		if(num1>num2){
			if(num1>100)
				System.out.println("num1�� �� ũ��.\n"+"num1 = "+num1);
		}
		else{
			if(num2>100)
				System.out.println("num2�� �� ũ��.\n"+"num2 = "+num2);
		}
		System.out.println("Done.");
	}
}
