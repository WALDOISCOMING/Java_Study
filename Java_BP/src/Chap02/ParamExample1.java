package Chap02;

/*
 * �ۼ�����:2017_03_07
 * �ۼ���:����
 * main �޼ҵ� �Ķ���� ���� ���
 * ���� 2-47
 */
public class ParamExample1 {
	public static void main(String[] args){
		for(String arg:args){
			System.out.println(arg);
		}
		System.out.println("length="+args.length);
		
	}
	
}
