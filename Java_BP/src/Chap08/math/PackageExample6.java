package Chap08.math;
import Chap08.geometry.*;
import Chap08.geometry.polygon.*;
/*
 * �ۼ�����:2017_03_13
 * �ۼ���:����
 * �������� import ������ �����ϴ� Ŭ������ ��
 * ���� 8-8
 */
public class PackageExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square obj1 = new Square(7);
		Rectangle obj2 = new Rectangle(5,10);
		if(obj1.getArea()>obj2.getArea())
			System.out.println("���簢���� �� ũ��");
		else
			System.out.println("���簢���� ���簢���� ���ų� �۴�");
		
	}

}
