package Chap05;

/*
 * �ۼ�����:2017_03_09
 * �ۼ���:����
 * �����ε� �� �޼ҵ带 �����ϴ� Ŭ����
 * ���� 5-31
 */
public class PhysicalInfo {
	String name;
	int age;
	float height,weight;
	public PhysicalInfo(String name,int age,float height,float weight) {
		this.name=name;this.age=age;this.height=height;this.weight=weight;
		// TODO Auto-generated constructor stub
	}
	void update(int age){
		this.age=age;
	}
	void update(int age,float height){
		this.age=age;this.height=height;
	}
	void update(int age,float height,float weight){
		this.age=age;this.height=height;this.weight=weight;
	}
}
