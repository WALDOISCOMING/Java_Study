package Chap08.math;
import Chap08.geometry.polygon.Rectangle;
import Chap08.geometry.Circle;
/*
 * �ۼ�����:2017_03_13
 * �ۼ���:����
 * �������� import ������ �����ϴ� Ŭ������ ��
 * ���� 8-8
 */
public class PackageExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj1 = new Circle(5);
		Rectangle obj2 = new Rectangle(8,9);
		if(obj1.getArea()>obj2.getArea()){
			System.out.println("���� �� ũ��");
		}
		else{
			System.out.println("���� ���簢���� ���ų� �۴�");
		}
		
	}

}
