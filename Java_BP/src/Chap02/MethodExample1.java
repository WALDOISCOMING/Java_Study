package Chap02;

/*
 * �ۼ�����:2017_03_07
 * �ۼ���:����
 * �޼ҵ� ȣ�� ���� �����ִ� ���α׷�
 * ���� 2-44
 */
public class MethodExample1 {
	public static void main(String[] args){
		printCharacter('*',30);
		System.out.println("Hello Java");
		printCharacter('-',30);
		
	}
	static void printCharacter(char ch,int num){
		for(int cnt=0;cnt<num;cnt++){
			System.out.print(ch);
		}
		System.out.println("");
	}
}