package Chap07;
/*
 * �ۼ�����:2017_03_12
 * �ۼ���:����
 * ���� Ÿ�Կ� ���� valueOf�޼ҵθ� ȣ���ϴ� ��
 * ���� 7-19
 */
public class EnumExample3 {
	public static void main(String[] args){
		printSeason(Season.SPRING);
		printSeason(Season.SUMMER);
		printSeason(Season.FALL);
		printSeason(Season.WINTER);
	}
	static void printSeason(Season season){
		
		System.out.println(season.value());
	}
}
