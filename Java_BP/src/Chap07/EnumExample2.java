package Chap07;
/*
 * �ۼ�����:2017_03_12
 * �ۼ���:����
 * ���� Ÿ�Կ� ���� valueOf�޼ҵθ� ȣ���ϴ� ��
 * ���� 7-19
 */
public class EnumExample2 {
	public static void main(String[] args){
		printDay("MONDAY");
		printDay("SUNDAY");
		printDay("MONDAY");
	}
	static void printDay(String name){
		Day day = Day.valueOf(name);
		System.out.println(day);
	}
}
