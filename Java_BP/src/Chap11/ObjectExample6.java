package Chap11;

/*
 * �ۼ�����:2017_03_15
 * �ۼ���:����
 * equals �޼ҵ� ��� ���� �����ִ� ���α׷�(2)
 * ���� 11-7
 */
public class ObjectExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(5);
		if(c1.equals(c2))
			System.out.println("����");
		else
			System.out.println("�ٸ�");
	}

}
