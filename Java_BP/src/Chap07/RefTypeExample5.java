package Chap07;

/*
 * �ۼ�����:2017_03_12
 * �ۼ���:����
 * ���۷��� ������ null �������� ���ؼ� ó���ϴ� ���α׷�
 * ���� 7-5
 */
public class RefTypeExample5 {
	public static void main(String[] args){
		Point obj=null;
		if(obj==null){
			System.out.println("obj�� ����Ű�� ��ü ����");
			return;
		}
		System.out.println(obj.x);
		System.out.println(obj.y);
		//System.out.printf("(%d,%d)%n",obj.x,obj.y);
	}
	
}
