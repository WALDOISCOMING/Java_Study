package Chap04;

/*
 * �ۼ�����:2017_03_08
 * �ۼ���:����
 * ||�������� ��� ��
 * ���� 4-14
 */
public class ConditionalOrExample1 {
	public static void main(String[] args){
		int num1=0,num2=0;
		if(++num1>0||++num2>0)
			System.out.println("num1>0||num2>0");
		System.out.println("num1"+num1);
		System.out.println("num2"+num2);
	}
}
