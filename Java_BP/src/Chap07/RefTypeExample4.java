package Chap07;
/*
 * �ۼ�����:2017_03_12
 * �ۼ���:����
 * null���� ���� ���۷��� ����
 * ���� 7-4
 */
public class RefTypeExample4 {
	public static void main(String[] args){
		Point obj =null;
		try{
		System.out.printf("(%d,%d)%n",obj.x,obj.y);
		}catch(Exception e){
			System.err.println(e);
		}
		
	}
	
}
