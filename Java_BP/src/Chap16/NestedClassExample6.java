package Chap16;

/*
 * �ۼ�����:2017_03_18
 * �ۼ���:����
 * ���� �׽�Ƽ�� Ŭ������ ��ü�� �����ϴ� ���α׷�
 * ���� 16-9
 */
public class NestedClassExample6 {
	public static void main(String[] args){
		Line.Point point = new Line.Point(100,200);
		printPoint(point);
		
	}
	static void printPoint(Line.Point point){
		System.out.printf("(%d %d) %n",point.x,point.y);
	}
}
