package Chap05;

/*
 * �ۼ�����:2017_03_09
 * �ۼ���:����
 * �����ε�� �޼ҵ带 ȣ���ϴ� ���α׷�
 * ���� 5-32
 */
public class MethodExample6 {
	public static void main(String[] args){
		PhysicalInfo obj;
		obj = new PhysicalInfo("�ظ�", 10,132.0f,35.0f);
		printPhysicalInfo(obj);
		obj.update(11,145.0f,54.0f);
		printPhysicalInfo(obj);
		obj.update(12,157.0f);
		printPhysicalInfo(obj);
		obj.update(13);
		printPhysicalInfo(obj);
		
		
	}
	static void printPhysicalInfo(PhysicalInfo obj){
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.height);
		System.out.println(obj.weight);
	}
}
