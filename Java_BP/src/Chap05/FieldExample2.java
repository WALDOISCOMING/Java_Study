package Chap05;

/*
 * �ۼ�����:2017_03_09
 * �ۼ���:����
 * Ŭ���� �ȿ� ����� �ʵ带 ����ϴ� ���α׷�
 * ���� 5-14
 * ���� 5-15: Ŭ�������� private�� �����Ͽ� ���⿡�� ���� �Ұ����ϰ� ��./
 */
public class FieldExample2 {
	public static void main(String[] args){
		Circle obj = new Circle(0.0);
//		obj.radius = 5.0;
		double area = obj.getArea();
	//	System.out.println(obj.radius);
		System.out.println(area);
	}
}
