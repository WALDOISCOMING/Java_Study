package Chap07;
/*
 * �ۼ�����:2017_03_12
 * �ۼ���:����
 * �Ĥö���ͷ� �Ѱ��� ���۷��� Ÿ�� �����͸� �޼ҵ� �ȿ� �����ϴ� ��
 * ���� 7-3
 */
public class RefTypeExample2 {
	public static void main(String[] args){
		Point obj = new Point(10,20);
		System.out.printf("(%d,%d)%n",obj.x,obj.y);
		rearrange(obj);
		System.out.printf("(%d,%d)%n",obj.x,obj.y);
	}
	static void rearrange(Point point){
		point.x = 30;
		point.y = 40;
	}
}
